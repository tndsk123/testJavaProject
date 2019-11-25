package ch04;
//중첩 for문을 통한 구구단 만들기
public class Gugudan2 {

	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("--- "+dan+" 단 ---");
			for(int n=1; n<=9; n++) {
				System.out.println(dan+" * "+n+" = "+dan*n);
			}//end inner for
		}//end outer for

	}

}
