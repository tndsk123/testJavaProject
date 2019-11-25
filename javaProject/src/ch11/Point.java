package ch11;

public class Point {//좌표값을 설정하는 클래스
	int a,b;
	
	public Point() {//기본생성자
		this(0,0);//매개변수가 있는 생성자 호출
	}
    //매개변수가 있는 생성자
	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}

}
