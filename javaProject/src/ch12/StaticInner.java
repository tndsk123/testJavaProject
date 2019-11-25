package ch12;

public class StaticInner {
	static int x=10;
	static class Inner{
		int getX() {
			return x;
		}
	}//end Inner class
	
	public static void main(String[] args) {
		//new 외부클래스이름.내부생성자 이름
		StaticInner.Inner in = new StaticInner.Inner();
		System.out.println(in.getX());
	}

}
