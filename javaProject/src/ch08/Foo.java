package ch08;

public class Foo {
	//멤버 변수
	int a;
	double b;

	public Foo() {//기본생성자
		this(1);//다른 생성자 호출
		int c=1;//로컬변수
	}

	public Foo(int x) {
		a=x;//멤버변수=로컬변수
		b=20.0;//멤버변수
		
	}
	public void sysout() {
		System.out.println("a="+a+"\t"+"b="+b);

	}
	
}
