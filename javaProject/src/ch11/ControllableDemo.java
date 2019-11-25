package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		
		Controllable.reset();
		//Controllable클래스의 static 메소드인 reset() 클래스이름.메소드로 접근가능
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
		Notebook not = new Notebook();
		not.turnOn();
		not.turnOff();
		not.repair();
		Controllable.reset();
	}

}
