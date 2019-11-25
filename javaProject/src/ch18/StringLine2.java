package ch18;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine2 extends JApplet{
	
	@Override
	public void init() {
		getContentPane().setBackground(Color.white);//배경색상 설정
		setSize(400,400);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawString("---------------------------------------", 20, 10);
		g.drawString("이름 : 홍길동", 20, 30);
		g.drawString("---------------------------------------", 20, 50);
		g.setColor(Color.green);
		g.drawString("이메일 : hong@gmail.com", 20, 70);
		g.drawString("---------------------------------------", 20, 90);
		g.setColor(Color.blue);
		g.drawString("hp : 010-1234-5678", 20, 110);
		g.drawString("---------------------------------------", 20, 130);
		
	}

}
