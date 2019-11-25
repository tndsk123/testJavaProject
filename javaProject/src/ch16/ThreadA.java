package ch16;

public class ThreadA {
	public static void main(String[] args) {
		//ThreadB를 객체생성 후 start()
		ThreadB b = new ThreadB();
		b.start();
		
		//b에 대해 동기화 블럭 설정
		synchronized (b) {
			System.out.println("b가 완료될 때까지 기다립니다.");
			try {
				//wait메소드 호출
				b.wait();
				//메인쓰레드는 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//깨어난 후 결과
			System.out.println("Total is : "+b.total);
		}
	}

}
