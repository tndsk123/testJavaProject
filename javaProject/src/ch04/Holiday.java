package ch04;

import java.util.Scanner;

//휴가일수 계산
//근속연수 1~3 ==> 1~3년 ==> 3일, 4~9년 ==> 5일
//10년 이상 10일, 20년 이상 ==> 20일
public class Holiday {

	public static void main(String[] args) {
		//변수 선언
		int year; //근속연수
		int days; //휴가일수
		
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요:");
		year = scan.nextInt();//키보드로 숫자를 입력받음
		scan.close();
		
		//계산
		if(year <=3) {
			days =3;
		}else if(year <10) {
			days =5;
		}else if(year<20) {
			days =10;
		}else {
			days=20;
		}
		//출력
		System.out.println("당신의 근속연수는"+year+" 년이고 ");
		System.out.println("휴가 일수는"+days+" 일 입니다.");

	}

}
