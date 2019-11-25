package ch13;
//Wrapper class(래퍼 클래스) - 기본 자료형을 포장하는 클래스
//기본 자료형에 대한 다양한 method를 지원
//byte-Byte, short-Short, int-Integer, long-Long, float-Float, double-Double, char-Character, boolean-Boolean
public class Wrapper {
	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=new Integer(20);//auto boxing
		int num1 = i1.intValue();//auto unboxing
		int num2 = i2;
		int sum = num1+num2;
		System.out.println(sum);
		System.out.println(Integer.toBinaryString(sum));//2진수 문자열
		System.out.println(Integer.toOctalString(sum));//8진수
		System.out.println(Integer.toHexString(sum));//16진수
		System.out.println(Integer.MAX_VALUE);//정수의 최대값
		System.out.println(Integer.MIN_VALUE);//정수의 최소값
		System.out.println(Integer.parseInt("100"));//
		System.out.println(Integer.toString(100));
		System.out.println(100+"");//앞뒤에""문자열을 연결하면 숫자도 문자열이 된다.
	}

}
