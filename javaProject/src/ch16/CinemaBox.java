package ch16;

public class CinemaBox {
	public synchronized void playCinemaA() {
		for(int i=1; i<=10; i++) {
			System.out.println("타짜!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void playCinemaB() {
		for(int i=1; i<=10; i++) {
			System.out.println("조커!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
