package ch08;

public class Singleton {
	
	//기본생성자
	private Singleton() {
		print();
	}
	
	private static Singleton instance; //싱글톤 처리된 생성자는 private static으로 처리 후 클래스명 변수명으로 명시하여 변수를 사용
	
	public static Singleton getIntance() {
		//생성자가 private 처리가 되었을 땐 이렇게 public static으로 처리한 메소드로 우회접근한다.
		if(instance==null) {
			instance=new Singleton();//여기서 실제 new를 통해 생성자를 호출하는 쪽으로 만들어준다.
			//처음엔 null상태에서 실행되어 생성자를 생성해서 쓰지만
			//두번째 부터 호출되면 null이 아니기 때문에 if문을 실행 안함
		}
		return instance;//참조변수의 주소 값을 리턴
	}
	
	public void print() {
		System.out.println("생성자");
	}

}
