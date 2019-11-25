package ch06;

public class VoidExam {
	
	static void hello() {//void:리턴 값이 없을 때 사용
		System.out.println("Hi");
		return;//리턴 값이 없을 때 return, 생략 가능		
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();//메소드 호출(method call)
		System.out.println("프로그램 끝");
	}

}
