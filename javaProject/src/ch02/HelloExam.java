package ch02;

public class HelloExam {

	public static int sum(int n, int m) {
	  return n + m;
	}
	
	//main()메소드에서 실행 시작
	public static void main(String[] args) {
		int i =20;//지역변수 초기화(할당)
		int s;//지역변수 선언
		char a;//지역변수 선언
		
		s=sum(i,10);//sum()메소드 호출,초기화(할당)
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
