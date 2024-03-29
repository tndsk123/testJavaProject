package ch04;

import java.util.Scanner;

public class MenuMath {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		outer : //Label 처리
			while(true) {
				System.out.println("(1) square(제곱)");
				System.out.println("(2) square root(제곱근)");
				System.out.println("(3) log(로그)");
				System.out.print("원하는 값(3)을 선택하세요.(종료:0)>");
				String tmp = scan.next();
				menu = Integer.parseInt(tmp);
				if(menu==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
					}else if(!(1<=menu && menu <=3)) {
						System.out.println("메뉴를 잘못 선택하셨습니다.");
						continue;
					}
				for(;;) {//for(;;)는 무한루프
					System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체종료:99)>");
					tmp = scan.next();
					num = Integer.parseInt(tmp);
					if(num==0)
						break;//for문을 벗어난다.
					if(num==99)
						break outer;//전체종료. for문과 while문 모두 탈출
					switch(menu) {
					case 1:
						System.out.println("result="+num*num);
						break;
					case 2:
						System.out.println("result="+Math.sqrt(num));//제곱근
						break;
					case 3:
						System.out.println("result="+Math.log(num));
						break;
					
					}//end switch case
				}//end for(;;)
				     
			}//end while
		System.out.println("프로그램을 모두 종료합니다");
		
	}//end main()

}
