package ch04;

import java.util.Scanner;

public class Ifelsescan {

	public static void main(String[] args) {
		int java=0, html=0, jsp=0, db=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("java 점수를 입력하세요");
		java=scan.nextInt();
		System.out.println("html 점수를 입력하세요");
		html=scan.nextInt();
		System.out.println("jsp 점수를 입력하세요");
		jsp=scan.nextInt();
		System.out.println("db 점수를 입력하세요");
		db=scan.nextInt();
		scan.close();
		int tot=java+html+jsp+db;
		double avg=tot/4.0;
		String grade="";
		
		if (avg>=90) {
			grade="수";
		}else if(avg>=80) {
			grade="우";
		}else if(avg>=70) {
			grade="미";
		}else if(avg>=60) {
			grade="양";
		}else {
			grade="가";
		}
		System.out.println("java\thtml\tjsp\tdb\ttot\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.1f\t%s",java,html,jsp,db,tot,avg,grade);
	}

}
