package ch12;

public class TestMemberOuter1 {
	private int data=30;
	class Inner{
		void msg() {
			System.out.println("data is "+data);
		}//end msg()
	}//end Inner class

	public static void main(String[] args) {
		//outer 객체 생성
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner in = obj.new Inner();
		in.msg();
	}
}
