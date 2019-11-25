package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class SmallProject {

	public static void main(String[] args) {
		int menu = 0;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println(" == 메뉴 == ");
			System.out.println("(1) 김치찌개");
			System.out.println("(2) 된장찌개");
			System.out.println("(3) 육개장");
			System.out.println("(4) 불고기");
			System.out.print("원하는 메뉴(1~4)를 선택하세요.(종료:0)>");
			String tmp = scan.next();
			menu = Integer.parseInt(tmp);
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1<=menu && menu <=4)) {
				System.out.println("메뉴를 잘 못 선택하셨습니다.(종료는:0)>");
				continue;
			}//end else if
			 if(menu==1) {
				System.out.println("선택하신 메뉴는"+menu+"번 김치찌개입니다.(종료:0)>");
			}else if(menu==2) {
				System.out.println("선택하신 메뉴는"+menu+"번 된장찌개입니다.(종료:0)>");
			}else if(menu==3) {
				System.out.println("선택하신 메뉴는"+menu+"번 육개장입니다.(종료:0)>");
			}else if(menu==4) {
				System.out.println("선택하신 메뉴는"+menu+"번 불고기입니다.(종료:0)>");
			}
			 
			 
			
		}//end while
		
		 
		

	}//end main

}
