package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int tot=0;
		int stu;
		System.out.println("----------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("성적처리할 학생수를 입력하시오 : ");
		stu = scan.nextInt();
		
		int score[] = new int[stu];
		for(int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			score[i]=scan.nextInt();
		}
		for(int i=0; i<score.length; i++) {
			tot+=score[i];
		}
		System.out.println("총점은 "+tot+"점 입니다.");
		System.out.println("평균 성적은 "+tot/score.length+"점 입니다.");
		System.out.println("----------------------------------------------------");
	}

}
