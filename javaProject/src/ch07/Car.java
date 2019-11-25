package ch07;

public class Car {
	String color;//색상, 값이 없을 때 null
	int speed;//속도
	int gear;//기어
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;//멤버변수 gear = 로컬변수 g
	}
	void speedUp() {
		speed = speed+10;
	}
	void speedDown() {
		speed = speed-10;
	}

}
