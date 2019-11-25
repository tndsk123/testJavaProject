package ch04;

import java.util.Scanner;

//사용자로부터 국,영,수 점수 입력받고 총점,평균 출력
public class While_School {

	public static void main(String[] args) {
		int count=0;// 입력된 정수의 개수
		int sum=0;//합계
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 각각 입력하고 "
				+ "마지막에 -1을 입력하세요");
		int n = scanner.nextInt();
		while(n !=-1) {//-1이 입력되면 while문 벗어남
			sum+=n;
			count++;
			n=scanner.nextInt();//정수 입력
		}//end wile
		
		if(count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.printf("총점은 %d이고 평균은 %4.1f 입니다.",sum,(double)sum/count);
		}//end else
	    scanner.close();

	}//end main()

}
