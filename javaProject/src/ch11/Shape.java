package ch11;

//1개라도 추상메소드가 있으면 클래스도 abstract 해야한다.

public abstract class Shape {
	int x, y;//멤버변수
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public abstract void draw();//추상메소드

}
