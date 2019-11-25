package ch16;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Anim extends Applet implements Runnable{
	//image 10장을 참조
	private Image[] img;//이미지 배열
	private int idx;//이미지배열의 인덱스 값
	
	@Override
	public void init() {//Applet 초기화
		img = new Image[10];//이미지 10개를 가리키는 객체참조변수배열 생성
		for(int i=0; i<img.length; i++) {
			//duke1.gif ~ duke10.gif 10장의 이미지 인스턴스 생성
			img[i]=Toolkit.getDefaultToolkit().getImage(getClass().getResource("duke"+(i+1)+".gif"));
			//배열의 index 0부터 시작이기 때문에 i+1을 해줌
		}//end for
		Thread t = new Thread(this);//new Thread(스레드구현객체)
		t.start();
		setSize(500,200);
	}//end init()
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img[idx], 90, 73, this);
		//g.drawImage(이미지, x, y, 이미지관찰자)
//		for(int i=0; i<img.length; i++) {
//			g.drawImage(img[i], i*40, 73, this);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		} //전체를 다 출력
	}

	@Override
	public void run() {
		while(true) {
			idx++;//이미지 인덱스 증가
			if(idx >= 10) {
				idx=0;
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
