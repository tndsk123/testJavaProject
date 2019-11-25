package ch05;

import java.util.Scanner;

public class ArrayLength2 {
	
	public static void main(String[] args) {
		int s[] =new int[3];
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(s.length+"개의 정수를 입력하세요>>");
		for(int i=0; i<s.length; i++) {
		   s[i] = scan.nextInt();
		}
		for(int i=0; i<s.length; i++)
			sum += s[i];
		
		System.out.println("평균은 "+(double)sum/s.length);
		scan.close();
		
	}

}
