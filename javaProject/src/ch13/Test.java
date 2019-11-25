package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.floor(10.9));
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(2, 3));
		Random rand = new Random();
		System.out.println("정수값:"+rand.nextInt(100));
		System.out.println("실수값:"+rand.nextDouble());
		
		int a = 10;
		Integer b=20;//내부적으로 intValue()가 작동
		Integer c=new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//예전에는 c.intValue()를 써야 했지만 자동으로 작동
		

	}

}
