package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		System.out.println("===================");
		
		//Flyer a = new Flyer(); 인터페이스는 객체생성 안
		Flyer f = new Bird();//다형성, 좌:부, 우:자
		f.takeOff();
		f.fly();
		f.land();
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}

}
