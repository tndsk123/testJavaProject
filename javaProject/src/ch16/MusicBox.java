package ch16;

//무작위로 메소드들이 스레드에 의해 실행되면 문제될 수 있다.
//따라서 이런 문제를 방지하기 위해 동기화(synchronized)를 적용한다.
//모니터링 락은 메소드 실행의 종료되거나, wait()과 같은 메소드를 만나기 전까지 유지된다.
//다른 스레드들은 모니터링 락이 놓여질때까지 대기한다.

public class MusicBox {
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("신나는 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void playMusicC() {
		for(int i=0; i<10; i++) {
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
