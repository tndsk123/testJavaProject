package ch06;

public class CallstackTest2 {
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();//ctrl+1:메서드 자동 생성 단축키
		System.out.println("main(String[] args)이 끝났음.");
	}

	private static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음");
		secondMethod();
		System.out.println("firstMehod()이 끝났음");
		
	}

	private static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음");
		System.out.println("secondMehod()이 끝났음");
		
	}

}
