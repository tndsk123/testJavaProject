package ch11;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird 날아오르다.");

	}

	@Override
	public void fly() {
		System.out.println("Bird 비행");

	}

	@Override
	public void land() {
		System.out.println("Bird 착륙");

	}

}
