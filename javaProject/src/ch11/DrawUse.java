package ch11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawUse extends Applet{
	
	Draw shape1;//interface 타입
	Draw shape2;
	
	public DrawUse() {
		shape1 = new DrawCircle(30,30,60,80);//다형성(좌:Draw, 우:DrawCircle)
		shape2 = new DrawLine(10,20,150,100);
		setBackground(Color.yellow);
	}
	
	@Override
	public void paint(Graphics g) {//main 메소드처럼 실행
		g.drawString("자바 그래픽", 100, 60);
		shape1.paint(g);//DrawCircle(30,30,60,80) 호출 실행
		shape2.paint(g);//DrawLine(10,20,150,100) 호출 실행
		

    }
}