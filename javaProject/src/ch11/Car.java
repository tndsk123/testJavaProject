package ch11;

public class Car implements Vehicle {

	@Override
	public void speedUP() {
		System.out.println("Car SpeedUp");

	}

	@Override
	public void speedDown() {
		System.out.println("Car SpeedDown");

	}

	@Override
	public void handle() {
		System.out.println("Car Handling");

	}

}
