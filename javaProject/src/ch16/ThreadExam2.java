package ch16;

public class ThreadExam2 {
	public static void main(String[] args) {
		MyThread2 m1 = new MyThread2("*");
		MyThread2 m2 = new MyThread2("-");
		//(주의점)Runnable을 쓸 때는 Thread를 별도로 생성 시켜야 한다.
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.start();
		t2.start();
		System.out.println("main end !!!");
	}

}
