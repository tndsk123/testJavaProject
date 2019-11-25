package ch10;

class Test11{
	public void print() {
		System.out.println("test11");
	}
}

class Test22 extends Test11{
	@Override
	public void print() {//메소드 오보라이드-메소드이름,매개변수...모두 동일
		System.out.println("test22");//재정의
	}
}

public class OverrideExam {
	public static void main(String[] args) {
		Test22 t=new Test22();
		t.print();
	}
}
