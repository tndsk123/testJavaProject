package ch18;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JApplet;

public class RandomLine extends JApplet{
	private Random random;
	
	@Override
	public void init() {
		setSize(300, 300);
		random = new Random();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0; i<100; i++) {
			int red=random.nextInt(256);//0~255
			int green=random.nextInt(256);
			int blue=random.nextInt(256);
			
			//색상표현을 하기 위한 2가지 방법 중 하나는 Color.상수
			//둘째는 Color(r,g,b)
			g.setColor(new Color(red, green, blue));//컬러값을 rgb패턴으로 출력
			
			int x1=random.nextInt(300);
			int y1=random.nextInt(300);
			int x2=random.nextInt(300);
			int y2=random.nextInt(300);
			g.drawLine(x1, y1, x2, y2);
		}
	}

}
