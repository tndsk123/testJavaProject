package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj = new SportsCar();
		//SportsCar 객체는 Car객체를 상속받았기 때문에 Car 객체의 멤버들(멤버변수,멤버메소드)을 모두 사용할 수 있다.
		obj.speed = 10;//Car의 멤버변수 speed에 10을 초기화
		obj.setSpeed(60);//Car의 멤버메소드 setSpeed(60)호출 및 초기화
		obj.setTurbo(true);
		
	}

}
