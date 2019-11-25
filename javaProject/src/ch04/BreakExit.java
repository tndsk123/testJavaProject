package ch04;

import java.util.Scanner;

public class BreakExit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scan.nextLine();
			if(text.contentEquals("exit"));//"exit"가 입력 되면 반복 종료
			//문자열 비교시 equals() 사용
			break;
		}//end while
		System.out.println("속았지?");
		scan.close();

	}

}
