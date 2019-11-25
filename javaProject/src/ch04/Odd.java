package ch04;

public class Odd {

	public static void main(String[] args) {
		int total=0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
			total=total+i;
			}// end if
		}//end for
		System.out.println("1부터 10까지의 홀수의 합은?"+total);
	}//end main

}
