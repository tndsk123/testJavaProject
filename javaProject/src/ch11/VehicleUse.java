package ch11;

public class VehicleUse {
	public static void main(String[] args) {
		Car c = new Car();
		c.speedUP();
		c.speedDown();
		c.handle();
		System.out.println();
		
		Plane p = new Plane();
		p.speedUP();
		p.speedDown();
		p.handle();
		System.out.println();
		
		Boat b =new Boat();
		b.speedUP();
		b.speedDown();
		b.handle();
	}

}
