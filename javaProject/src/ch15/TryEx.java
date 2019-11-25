package ch15;

public class TryEx {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		
		//ArrayIndexOutOfBoundsException - 배열의 인덱스 범위를 초과할 때 발생
		try {//예외가 발생할 가능성이 있는 코드
			for(int i=0; i<=num.length; i++) {
				System.out.println(num[i]);
				}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
