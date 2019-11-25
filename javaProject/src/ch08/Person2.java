package ch08;

public class Person2 {
	private String name, adress, number;
	private int age;
	
	public Person2() {
		this("홍길동",30,"서울 강동", "010-123-4567");
	}
	
	public Person2(String name) {
		this(name,30,"서울 강동", "010-123-4567");
	}
	
	public Person2(String name, int age) {
		this(name,age,"서울 강동", "010-123-4567");
	}
	
	public Person2(String name, int age, String adress) {
		this(name,age,adress, "010-123-4567");
	}
	
	public Person2(String name, int age, String adress,String number) {
		this.name=name;
		this.age=age;
		this.adress=adress;
		this.number=number;
	}
	
	public void showInfo() {
		System.out.println("===개인 정보===");
		System.out.println("이 름 : "+name+"\n"+"나 이 : "+age+"\n"+"주 소 : "+adress+"\n"+"전화번호 : "+number);
	}

}
