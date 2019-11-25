package ch11;

import java.awt.Graphics;

public class DrawCircle extends Point implements Draw {

	private int width, height;
	
	public DrawCircle() {
		this(0,0,0,0);
	}
	public DrawCircle(int a, int b, int w, int h) {
		super(a,b);//부모클래스의 생성자 호출
		this.width = w;
		this.height = h;
	}
	@Override
	public void paint(Graphics g) {//Graphics : 그래픽 처리 클래스
		//타원그리기(x,y,가로,세로)
		g.drawOval(a, b, width, height);

	}

}
