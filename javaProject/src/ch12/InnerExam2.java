package ch12;

public class InnerExam2 {
	static class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam2.Cal cal = new InnerExam2.Cal();
		//inner class와는 달리 참조변수.new하지 않는다.
		cal.plus();
		System.out.println(cal.value);
	}

}
