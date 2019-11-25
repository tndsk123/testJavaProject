package ch16;

public class RunnableExam implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//end run()
	public static void main(String[] args) {
		RunnableExam e1 = new RunnableExam();
		//Runnable을 쓸 때는 Thread를 별도로 생성해서 써야한다.
		Thread t1=new Thread(e1,"Thread1");
		Thread t2=new Thread(e1,"Thread2");
		//t1.run();에러는 아니지만 main인 싱글스레드가 실행된다.
		t1.start();//run() 호출
		t2.start();
	}

}
