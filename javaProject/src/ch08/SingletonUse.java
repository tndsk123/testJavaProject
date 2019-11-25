package ch08;

public class SingletonUse {
	public static void main(String[] args) {
		Singleton a = Singleton.getIntance();
		System.out.println(a);
		//Singleton a = new Singleton(); => x -> private처리된 생성자를 new로 호출하면 에러
		//클래스이름 변수 = 클래스 이름.메소드 이름으로 싱글톤 처리된(private) 생성자를 접근
	}

}
