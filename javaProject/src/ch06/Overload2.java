package ch06;

public class Overload2 {
 
	public static void main(String[] args) {
		System.out.println("-------------------------");
		print("홍길동");
		print(25);
		print("서울 강동구");
		print("010-123-4567");
		System.out.println("-------------------------");
	}

	protected static void print(int i) {
		System.out.println(i);
		
	}

	public static void print(String string) {
		System.out.println(string);
		
	}
}
