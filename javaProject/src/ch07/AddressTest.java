package ch07;

public class AddressTest {

	public static void main(String[] args) {
		Address me = new Address();
		me.name = "홍길동";
		me.age = 30;
		me.number = "010-123-4567";
		
		System.out.println("---------------------------------");
		System.out.println("이름 : "+me.name);
		System.out.println("나이 : "+me.age);
		System.out.println("전화번호 : "+me.number);
		System.out.println("---------------------------------");

	}

}
