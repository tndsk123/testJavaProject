package ch21_jdbc;

import java.util.Scanner;

public class MotorList {
	
	void print(MotorDTO2 dto) {
		System.out.println("=====================");
		System.out.println("번호 : "+dto.getLi_number());
		System.out.println("연도 : "+dto.getYear());
		System.out.println("제조사 : "+dto.getCompany());
		System.out.println("연비 : "+dto.getEff());
		System.out.println("=====================");
	}
	
	public static void main(String[] args) {
		MotorList ml = new MotorList();
		Scanner scan = new Scanner(System.in);
		System.out.print("차량 번호를 입력하세요 : ");
		String li_number=scan.nextLine();
		MotorDAO2 dao=new MotorDAO2();
		MotorDTO2 dto=dao.Search(li_number);
		ml.print(dto);
		scan.close();
		
	}
}
