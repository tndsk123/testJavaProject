package ch21_jdbc;

import java.util.List;
import java.util.Scanner;

public class AccountManage {
	AccountDAO dao= new AccountDAO();
	
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.print("삭제할 은행명을 입력하세요.");
		String bank=scan.next();
		int result=dao.deleteAccount(bank);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("은행명을 다시 확인해주세요.");
		}
	}
	
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.print("은행 : ");
		String bank=scan.next();
		System.out.print("계좌번호 : ");
		String num=scan.next();
		System.out.print("이름 : ");
		String name=scan.next();
		System.out.print("잔액 : ");
		int money = scan.nextInt();
		AccountDTO dto=new AccountDTO(bank, num, name, money);
		dao.insertAccount(dto);
		System.out.println("저장되었습니다.");
	}
	
	void list() {
		List<AccountDTO> items = dao.listAccount();
		System.out.println("==========================================");
		System.out.println("은행\t계좌번호\t\t예금주\t잔액");
		System.out.println("==========================================");
		for(AccountDTO dto : items) {
			System.out.print(dto.getBank()+"\t");
			System.out.print(dto.getNum()+"\t");
			System.out.print(dto.getNAME()+"\t");
			System.out.print(dto.getMoney()+"\n");
		}
	}
	public static void main(String[] args) {
		AccountManage account=new AccountManage();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println(
					"메뉴를 선택하요(1:목록 2:추가 3:삭제 0:종료)");
			int code=scan.nextInt();
			switch (code) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);			
				break;
			case 1: account.list(); break;
			case 2: account.insert(); break;
			case 3: account.delete(); break;
			}
		}
	}

}
