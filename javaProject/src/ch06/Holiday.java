package ch06;

import java.util.Scanner;

public class Holiday {

	static int y;//전역변수,멤버변수(클래스 전체에서 사용할 수 있는 변수)
	
	static void input() {//근속년수
		Scanner scan=new Scanner(System.in) ;
		System.out.println("근속연수를 입력하세요 : ");
		y=scan.nextInt();
		scan.close();
 	}
	
	static int holiday(int year) {//휴가일수 계산
		int day=0;//day는 지역변수
		if(year <= 5) {
			day=10;
		}else if(year <= 10) {
			day=15;
		}else {
			day=20;
		}
		return day;
	}//holiday
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수:"+holiday(y));
	}
}
