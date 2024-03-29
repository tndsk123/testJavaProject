package ch06;

import java.math.BigInteger;

public class Bigint {
	
//큰수를 다루기 위해 BigInteger 를 씀	
	static BigInteger factorial(int n) {
		BigInteger fac=BigInteger.ONE;//ONE은 1임 BigInteger.1 하면 안됨
		for(int i=1; i<=n; i++) {
			fac=fac.multiply(BigInteger.valueOf(i));//객체로 바꿔주는 작업
		}
		return fac;
	}//end factorial()
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
			System.out.println(i+"팩토리얼 = "+factorial(i));
		    System.out.println();//줄바꿈
		
	}

}
