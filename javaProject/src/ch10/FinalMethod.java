package ch10;

class T {
	private int num=10;
	public final void print() {
		//메소드에 final을 쓰면 오버라이딩이 안된다.
		System.out.println(num);
	}
}

public class FinalMethod extends T {
	int num=100;
	
//	@Override
//	public void print() {
//	}
	
	public static void main(String[] args) {
		FinalMethod f=new FinalMethod();
		f.print();
	}
	

}
