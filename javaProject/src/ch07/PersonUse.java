package ch07;

public class PersonUse {
	
	public static void main(String[] args) {
		//클래스를 사용하기 위해서는 메모리에 올려야함
		//객체(인스턴스)생성, 인스턴스화
		Person p1 = new Person();//객체 참조변수 = new 객체();
		p1.setName("김철수");
		p1.setAge(30);
		p1.setHeight(180);
		p1.print();
		System.out.println("이름 : "+p1.getName());
		System.out.println("나이 : "+p1.getAge());
		System.out.println("키 : "+p1.getHeight());
//		p1.name = "김철수";//참조변수.멤버
//		p1.age = 20;
//		p1.height = 180;
//		System.out.println("이름 : "+p1.name);//참조변수.멤버(변수,메소
//		System.out.println("나이 : "+p1.age);
//		System.out.println("키 : "+p1.height);
	}

}
