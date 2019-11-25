package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요 : ");
		int year = scan.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
		if(cal.isLeapYear(year)) {//윤년계산 메소드(isLeapYear())
			System.out.println("윤년이다.");
		}else {
			System.out.println("평년이다.");
		}
	}

}
