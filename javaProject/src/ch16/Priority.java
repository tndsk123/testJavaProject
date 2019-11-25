package ch16;

public class Priority extends Thread{
	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		//쓰레드의 이름 설정
		e1.setName("thread1");
		e2.setName("thread2");
		System.out.println("e1의 기본 우선순위:"+e1.getPriority());
		System.out.println("e2의 기본 우선순위:"+e2.getPriority());
		
		//Thread.MAX_PRIORITY 최대우선순위(10)
		//Thread.NORM_PRIORITY 기본우선순위(5)
		//Thread.MIN_PRIORITY 최소우선순위(1)
		
		e1.setPriority(Thread.MIN_PRIORITY);//최소 우선순위(1)
		e1.setPriority(Thread.MAX_PRIORITY);//최대 우선순위(10)
		e1.start();//run()호출
		e2.start();
	}//end main()
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}

}
