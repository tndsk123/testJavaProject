package ch13;
//extends Object 가 기본적으로 생략
//import java.lang.*; 가 기본적으로 생략
public class Obj {
	
	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);//객체의 주소값
		System.out.println(e1.toString());
		//계층구조를 볼 때는 F4키를 눌러 확인
		//코드를 볼 때는 F3키를 눌러 확인
	}

}
