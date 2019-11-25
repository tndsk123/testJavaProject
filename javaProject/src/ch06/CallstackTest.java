package ch06;
//method 종료 후 호출 한 method로 돌아감

public class CallstackTest {
	
	public static void main(String[] args) {
		firstMethod();
	}

	private static void firstMethod() {
		secondMethod();
		
	}

	private static void secondMethod() {
		System.out.println("secondMethod()");
		
	}

}
