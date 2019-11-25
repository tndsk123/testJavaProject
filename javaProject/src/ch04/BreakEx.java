package ch04;

public class BreakEx {

	public static void main(String[] args) {
		int n=1;
		while(true) {
			if(n==8)
				break;
			System.out.println(n+" Hello World");
			n++;
			
		}
		System.out.println("n 값이"+n+"이며 while문을 빠져나옴");

	}

}
