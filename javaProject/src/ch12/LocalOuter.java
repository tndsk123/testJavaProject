package ch12;

//Local inner class : 메소드 안에 생성되는 클래스(지역내부클래스)
//지역내부클래스 규칙
//1.Local inner class는 외부메소드로부터 불러올 수 없다.(일회성)
//2.jdk1.7까지는 지역변수에 접속할 수 없다.

public class LocalOuter {
	private int data=30;
    void display() {
		class LocalInner{//지역내부 클래스
			void msg() {
				System.out.println(data);
			}
		}//end LocalInner class
		LocalInner li = new LocalInner();
		li.msg();
	}//end display()
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}

}
