package ch10;
//overload : method이름은 같고 자료형 또는 매개변수갯수는 달라야 함.
public class Overload {
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Overload o=new Overload();
		o.putData("hello");
		o.putData(10);
		o.putData(10.5);
	}

}
