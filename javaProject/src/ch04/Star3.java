package ch04;

public class Star3 {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}//inner
			for(int j=0; j<2*i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}//outer

	}

}
