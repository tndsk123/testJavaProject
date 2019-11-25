package ch18;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet{
	
	@Override
	public void init() {
		getContentPane().setBackground(new Color(255, 255, 255));//배경색상 설정
		setSize(300,300);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//g.setColor(); 기본색상 검은색
		g.setColor(Color.blue);//색상 설정
		g.drawLine(250, 50, 30, 160);//선그리기
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);
		g.setColor(Color.green);
		g.drawString("Green String", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
	}

}
