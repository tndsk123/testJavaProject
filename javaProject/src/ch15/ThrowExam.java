package ch15;

public class ThrowExam {
	//throw : 예외를 직접 발생시키는 방법, 테스트용 외에는 거의 쓸 일이 없다.
	static void test(int n) {
		if(n==0) {
			throw new NullPointerException();
		}
	}
	
	public static void main(String[] args) {
		test(0);
	}

}
