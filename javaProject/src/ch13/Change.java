package ch13;

public class Change {
	public static void main(String[] args) {
		int a=5;//콜라컵
		int b=15;//사이다컵
		int temp;//빈컵, b의 값을 a에 넣기 전에 미리 백업하여 거처가는 임시변수
		
		
		temp=a;//콜라 =>빈컵
		a=b;//콜라컵 =>사이다
		b=temp;//콜라가 있는 빈컵의 내용을 사이다컵에 넣는다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(temp);
		
	}

}
