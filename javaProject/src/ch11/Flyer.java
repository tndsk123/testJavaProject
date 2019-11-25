package ch11;

//인터페이스(interface) 클래스는 추상화 정도가 높다.
//인터페이스도 추상클래스(Abstract)처럼 인스턴스를 만들 수 없다.
public interface Flyer {
	//추상메소드들만 존재
	public void takeOff();
	public void fly();
	public void land();

}
