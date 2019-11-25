package ch16;

public class ThreadExam1 {
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1("*");
		MyThread1 m2 = new MyThread1("-");
		m1.start();
		m2.start();
		System.out.println("main end !!!");
	}

}
