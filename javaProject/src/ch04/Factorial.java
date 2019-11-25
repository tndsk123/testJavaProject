package ch04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact =1; //팩토리얼 값이 너무 커질 수 있어 long으로 정의
		//ex) 3! = 3*2*1
		int n;
		
		System.out.println("정수를 입력하시오 :");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.printf("%d!은 %d입니다.",n,fact);
	}

}
