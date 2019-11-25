package ch08;

public class MemberUse2 {
	public static void main(String[] args) {
		
		
		Member2 m =new Member2();
		m.getGrade();
		m.print();
		
		
		Member2 m1 = new Member2("김철수","kim","컴퓨터",500000);
		m1.getGrade();
		m1.print();
		
		
		Member2 m2 = new Member2();
		m2.input("김철수","kim", "라면", 3000);
		m2.getGrade();
		m2.print();
		
	
		
		
	}

}
