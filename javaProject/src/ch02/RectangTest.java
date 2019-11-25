package ch02;

import java.util.Scanner;

public class RectangTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		double sum;
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		x = input.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		y = input.nextDouble();
		
		sum = x * y;
		System.out.println("직사각형의 넓이는" + sum+"입니다" );
		
		input.close();

	}

}
