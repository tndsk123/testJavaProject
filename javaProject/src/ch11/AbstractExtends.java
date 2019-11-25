package ch11;
//추상클래스를 쓰는 이유는 표준화(유지보수의 이유)때문.
//추상클래스는 인스턴스를 만들 수 없음.

public class AbstractExtends extends AbstractClass{

	//추상클래스 상속받았을 때는 반드시 추상메소드를 오버라이딩(구현)해 주어야 한다.
	@Override
	void method1() {
		 System.out.println("추상 method를 완성한 메소드");		
	}
	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}
	

}
