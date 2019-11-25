package ch12;

public class LocalOuter2 {
	private int data = 30;//멤버변수
	void display() {
		int value = 50;//지역변수(jdk1.7까지는 이 변수를 사용하려면 마지막이어야 한다.
		class LocalInner2{
			void msg() {
				System.out.println(value);
			}
		}//end inner class
		LocalInner2 li = new LocalInner2();
		li.msg();
	}//end display()
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
		
	}

}
