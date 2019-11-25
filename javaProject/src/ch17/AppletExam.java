package ch17;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletExam extends Applet{
	
	@Override
	public void init() {
		System.out.println("init...");
	}
	
	@Override
	public void start() {
		System.out.println("start...");
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("paint...");
		g.setColor(Color.green);
		g.fillRect(10, 10, 50, 50);
	}
	
	@Override
	public void stop() {
		System.out.println("stop...");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

}
