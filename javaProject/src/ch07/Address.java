package ch07;

public class Address {
	String name;
	int age;
	String number;
	
	void print() {
		System.out.println("---------------------------------");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("전화번호 : "+number);
		System.out.println("---------------------------------");
	}
	String getname() {
		return name;
	}
	void setAge(int ag) {
		age = ag;
	}

}
