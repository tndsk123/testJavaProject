package ch16;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BufferingAnim2 extends Applet implements Runnable {
	private Image[] img; 	
	private int idx; 
	private Image offImage; 
	private Graphics bg; 
	
	@Override
	public void init() {
		img = new Image[11]; 
		for(int i=0; i<img.length; i++) {
			img[i]=Toolkit.getDefaultToolkit().getImage(
					getClass().getResource("IMG_"+(i+9011)+".jpg"));
		}
		Thread t=new Thread(this);
		t.start();
		setSize(1000, 700);
	}
	@Override
	public void update(Graphics g) {
		Dimension d = getSize();
		if(offImage == null) {
			offImage = createImage(d.width, d.height);
			bg = offImage.getGraphics();
		}
		bg.setColor(getBackground());
		bg.fillRect(0, 0, d.width, d.height); 
		bg.drawImage(img[idx], 0, 0, null);
		paint(g);
	}
	@Override
	public void paint(Graphics g) {
		if(offImage != null) {
			g.drawImage(offImage, 0, 0, this);
		}
	}
	@Override
	public void run() {
		while(true) {
			idx++;
			if(idx >= 11) {
				idx = 0;
			}
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
