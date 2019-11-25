package ch09;

class CarMajor{
	int getSpeed() {
		return 0;
	}
}

class BMWCar extends CarMajor{
	int getSpeed() {
		return 300;
	}
}

class BENZCar extends CarMajor{
	int getSpeed() {
		return 280;
	}
}

class AUDICar extends CarMajor{
	int getSpeed() {
		return 310;
	}
}




public class CarMajorUse {
	public static void main(String[] args) {
		BMWCar c1 = new BMWCar();
		BENZCar c2 = new BENZCar();
		AUDICar c3 = new AUDICar();
		System.out.println("bmw : "+c1.getSpeed()+"km");
		System.out.println("benz : "+c2.getSpeed()+"km");
		System.out.println("audi : "+c3.getSpeed()+"km");
	}

}
