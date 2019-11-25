package ch08;

public class Person {
	private String name;
	private int height;
	private int weight;
	
	public Person() {//기본생성자
		this("김철수",170,60);//Person(String,int,int)형태의 오버로딩된 생성자 호출
	}
	
	public Person(String name) {
		this(name,190,100);//Person(String,int,int)형태의 오버로딩된 생성자 호출
	}
	
	public Person(String name, int height) {
		this(name,height,50);//Person(String,int,int)형태의 오버로딩된 생성자 호출
	}
	
	public Person(String name, int height, int weight) {
		this.name = name;//this.멤버변수 처리는 상단의 멤버변수에 값 할당
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이 름 : "+name+"\n"+"신 장 : "+height+"\n"+"체 중 : "+weight);
	}


}
