package ch10;

public class StaticVar2 {
	static int total;//클래스 메모리 영역에 생성
	String model;//heap 영역에 생성
	public StaticVar2(String model) {//생성자
		this.model=model;
		total++;//1,2,3
	}
}
