package ch06;

import java.util.Scanner;

public class Holiday2 {
	static int y;
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("근속년수를 입력해 주세요 :");
		y=scan.nextInt();
		scan.close();
	}
	static int holiday(int years) {
		int day=0;
		if(years <=5) {
			day=10;
		}else if(years <=10){
			day=15;
		}else {
			day=20;
		}
		return day;
	}
	static void print() {
		input();
		System.out.println("휴가일수:"+holiday(y));
	}
	public static void main(String[] args) {
		print();
	}
	

}
