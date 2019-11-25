package ch06;

public class Abs {

	static int abs(int num) {
		return num>0 ? num : -num;//양수가 들어오면 그대로 실행, 음수가 들어오면 양수로 실행 => 절대값
	}
	
	public static void main(String[] args) {
		int a=-15;
		System.out.println(a);
		System.out.println(abs(-a));//call by value
		System.out.println(Math.abs(a));
		
	}
}
