package ch06;

public class Test {
	//method 오버로딩
	static void print(double a) {
		System.out.println(a);
	}
	static void print(String a) {
		System.out.println(a);
	}
	static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void print(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		
	}
	
	

}
