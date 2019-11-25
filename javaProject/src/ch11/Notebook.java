package ch11;

public class Notebook implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");

	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");

	}

}
