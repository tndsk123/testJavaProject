package ch16;

/*데몬 쓰레드
 * 데몬(Daemon)이란 보통 리눅스와 같은 유닉스계열의 운영체제에서 백그라운드로 동작하는 프로그램을 말한다. 
 * 데몬쓰레드를 만드는 방법은 쓰레드에 데몬 설정을 하면 된다.
 * 윈도우에서는 서비스라고 함
 * 예) 워드프로세서 등을 실행할 때 일정시간동안 자동 저장하거나 맞춤법 검사 등을 하는 기능 등등
 * 이런 쓰레드는 자바프로그램을 만들 때 백그라운드에서 특별한 작업을 처리하게 하는 용도로 만든다.
 * 데몬쓰레드는 일반 쓰레드(main..)가 모두 종료되면 강제적으로 종료되는 특징을 가지고 있다.
 */


public class DaemonThread implements Runnable{

	@Override
	public void run() {
		while(true) {//무한반복
			System.out.println("데몬 쓰레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;//Exception 발생 시 while문 종료
			}
		}
	}//end run()
	
	public static void main(String[] args) {
		Thread th = new Thread(new DaemonThread());//데몬쓰레드로 설정
		th.setDaemon(true);
		//쓰레드 실행
		th.start();
		
		//메인쓰레드가 1초뒤에 종료되도록 설정
		//데몬 쓰레드는 다른 쓰레드가 모두 종료되면 자동 종료
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메일 쓰레드가 종료됩니다.");
	}

}
