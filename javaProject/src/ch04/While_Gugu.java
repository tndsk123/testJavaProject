package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요.");
		int dan=scan.nextInt();
		int i=1;
		while(i<=9) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		

	}

}
