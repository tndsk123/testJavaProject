package ch04;

import java.util.Scanner;

public class SwitchScan {

	public static void main(String[] args) {
       int java, html, jsp, db;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("java 점수를 입력하세요");
		java=scan.nextInt();
		System.out.println("html 점수를 입력하세요");
		html=scan.nextInt();
		System.out.println("jsp 점수를 입력하세요");
		jsp=scan.nextInt();
		System.out.println("db 점수를 입력하세요");
		db=scan.nextInt();
		scan.close();//end scan
		int tot=java+html+jsp+db;
		double avg=tot/4.0;
		String grade="";
		
		switch((int)(avg/10)) {
		case 10:
		case 9:grade="수";
		break;
		case 8:grade="우";
		break;
		case 7:grade="미";
		break;
		case 6:grade="양";
		break;
		default:grade="가";
		}//end switch
		System.out.println("java\thtml\tjsp\tdb\ttot\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.1f\t%s",java,html,jsp,db,tot,avg,grade);
	}//end main

}
