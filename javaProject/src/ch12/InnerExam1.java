package ch12;

public class InnerExam1 {
	//멤버영역의 내부클래스(inner class)
	class Cal{
		int value=0;
		public void plus() {
			value++;
		}//end plus()
	}//end class Cal

	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal= t.new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
