package ch08;

public class MemberUse {
	public static void main(String[] args) {
		Member m1;
		m1 = new Member();
		m1.input("김철수", "kim", 50000);
		m1.getGrade();
		m1.print();
		
		Member m2 = new Member("박철수","park",100000);
		m2.getGrade();
		m2.print();
		
		
	}

}
