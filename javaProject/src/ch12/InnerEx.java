package ch12;

public class InnerEx {
	private static int x=10;
	class Inner{//내부클래스
		int getX() {
			return x;//외부클래스의 private 변수도 쓸 수 있다.
		}
	}//end Inner class
	
	public static void main(String[] args) {
		System.out.println(x);
		InnerEx e = new InnerEx();
		InnerEx.Inner in = e.new Inner();
		System.out.println(in.getX());
	}

}
