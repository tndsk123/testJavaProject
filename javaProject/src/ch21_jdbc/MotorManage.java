package ch21_jdbc;

import java.util.List;
import java.util.Scanner;

public class MotorManage {
	MotorDAO dao = new MotorDAO();
	void list() {
		List<MotorDTO> items=dao.listMotor();
		System.out.println("===============================================");
		System.out.println("차량번호\t\t연도\t제조사\t연비");
		System.out.println("===============================================");
		for(MotorDTO dto : items) {
			System.out.print(dto.getLi_number()+"\t\t"+dto.getYear()+"\t"+dto.getCompany()+"\t"+dto.getEff()+"\n");
			
		}
	}
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("차량번호 : ");
		String li_number=scan.nextLine();
		System.out.print("제조사 : ");
		String company = scan.nextLine();
		System.out.println("제조년도 : ");
		int year = scan.nextInt();
		System.out.println("연비 : ");
		int eff = scan.nextInt();
		MotorDTO dto=new MotorDTO(li_number, company, year, eff);
		dao.insertMortor(dto);
		System.out.println("추가되었습니다.");
	}
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 차량회사를 입력하세요 : ");
		String company = scan.nextLine();
		int result=dao.deleteMotor(company);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("차량번호를 확인하세요.");
		}
	}//end delete();
	public static void main(String[] args) {
		MotorManage motor = new MotorManage();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("작업을 선택하세요 (1:목록 2:추가 3:삭제 0:종료):");
			int code = scan.nextInt();
			switch(code) {
			case 0 : scan.close();
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); break;
			case 1 : motor.list(); break;
			case 2 : motor.insert(); break;
			case 3 : motor.delete(); break;
			}
		}
	}

}
