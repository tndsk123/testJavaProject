package ch21_jdbc;

import java.util.List;
import java.util.Scanner;

public class AddressManage {
	AddressDAO dao=new AddressDAO();
	
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 주소록의 이름를 입력하세요.");
		String name=scan.next();
		int result=dao.delete(name);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("이름을 다시 확인해주세요.");
		}
	}//end delete()
	
	void list() {
		List<AddressDTO> list=dao.list();
		System.out.println("======================================================");
		System.out.println("이름\t주소\t\t핸드폰\t\t이메일");
		System.out.println("======================================================");
		for(AddressDTO dto : list) {
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getHp()+"\t");
			System.out.print(dto.getEmail()+"\n");
		}
	}//end list
	
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=scan.next();
		System.out.print("주소 : ");
		String addr=scan.next();
		System.out.print("핸드폰 : ");
		String hp=scan.next();
		System.out.print("이메일 : ");
		String email=scan.next();
		AddressDTO dto = new AddressDTO(name, addr, hp, email);
		dao.insert(dto);
		System.out.println("저장되었습니다.");
	}
	public static void main(String[] args) {
		AddressManage am= new AddressManage();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요(1:주소목록 2:주소록등록 3:주소록삭제 0:종료):");
			int code = scan.nextInt();
			switch (code) {
			case 0:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				scan.close(); break;
			case 1: am.list(); break;
			case 2: am.insert(); break;
			case 3: am.delete(); break;
			default: System.out.println("번호를 다시한번 확인해주세요"); break;
			}
			
			
		}
	}

}
