package ch10;

public class Test {
	static int a=1; //static member
	int b=2; //non-static member
	
	void print() {//non-static method 에서는 static과 non-static
		//멤버변수를 쓸 수 있다.
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		//System.out.println(a);
		//System.out.println(b);
		Test t = new Test();//객체생성 후에나 non-static멤버 사용 가능
		//System.out.println(t.b);
		t.print();
		//t=null;//객체가 주소를 잃고 떠돌아 다님
		//System.out.println(t.b);
	}
}
