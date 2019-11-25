package ch13;

public class AutoBox {
	public static void main(String[] args) {
		//기본자료형
		int num1 = 10;
		int num2;
		//객체자료형(클래스자료형)
		Integer i1;
		Integer i2 = new Integer(20);//auto boxing처리(기본자료형(20)을 객체로 박싱처리)
		i1 = num1;//업캐스팅
		num2 = i2;//auto unboxing 처리(객체 안에 들어 있는 값을 풀어서 저장)
		//다운캐스팅
		System.out.println(num1+","+i1+","+num2+","+i2);
		
	}

}
