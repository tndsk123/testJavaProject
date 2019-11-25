package ch07;

public class StudentUse {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setMajor("수정과");
		s1.setYear(3);
		s1.setNum("1234");
		s1.setPoint(4.1);
		s1.setMoney(400);
		s1.setSave(250);
		s1.print();
	}

}
