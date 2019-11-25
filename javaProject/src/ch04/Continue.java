package ch04;

public class Continue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i % 5==0)//5의 배수를 만나면
				continue;//이하 코드 무시, 다음 조건으로//
			System.out.println(i);
		}

	}

}
