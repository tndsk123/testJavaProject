package ch16;

public class ExternThread {
	public static void main(String[] args) {
		//스레드 기능을 외부클래스에서 구현
		MyThread t1 = new MyThread("thread1");
		MyThread t2 = new MyThread("thread2");
		t1.start();
		t2.start();

	}

}
