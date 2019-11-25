package ch06;

public class Gugu {
	
	static void gugu(int dan) {
		System.out.println("=== "+dan+"단 ===");
		for(int i=1; i<=9; i++)
			System.out.println(dan+" x "+i+" = "+(dan*1));
	}//end gugu()
	
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			gugu(i);
		}
		//main쪽 코딩량이 적을수록 좋은 프로그램
	}

}
