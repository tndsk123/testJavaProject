package ch04;

public class Char_Tower {

	public static void main(String[] args) {
		int i,j;
		char a=65; //65는 아스키 코드로 'A'이다.
		for(i=1; i<5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(a++);
			}//inner
			System.out.println();
		}//outer
		
	}//main()
}
