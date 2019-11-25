package ch13;

public class AutoBox2 {

	public static void main(String[] args) {
		int num1 = 30, num2 = 40, num3 = 0;
		Integer i1 = 0, i2=0;
		Integer i3 = new Integer(50);//auto boxing
		i1 = num1;
		i2 = num2;
		num3 = i3;//auto unboxing
		
		System.out.println("-------------------------------");
		System.out.println("기본자료형 : "+ num1 + ", 객체자료형 : "+ i1);
		System.out.println("기본자료형 : "+ num2 + ", 객체자료형 : "+ i2);
		System.out.println("기본자료형 : "+ num3 + ", 객체자료형 : "+ i3);
		System.out.println("-------------------------------");
		

	}

}
