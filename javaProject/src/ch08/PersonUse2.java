package ch08;

public class PersonUse2 {
	
	public static void main(String[] args) {
		Person2 p1 = new Person2();//객체생성, 기본생성자 호출
		p1.showInfo();
		
		Person2 p2 = new Person2("홍길동");//Person(String)생성자 호출
		p2.showInfo();
		
		Person2 p3 = new Person2("홍길동",30);//Person(String, int)생성자 호출
		p3.showInfo();
		
		Person2 p4 = new Person2("홍길동",30,"서울 강동");//Person(String, int, int)생성자 호출
		p4.showInfo();
		
		Person2 p5 = new Person2("홍길동",30,"서울 강동","010-123-4567");//Person(String, int, int)생성자 호출
		p5.showInfo();
	
	}

}
