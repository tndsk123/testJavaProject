package ch16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class BufferBall extends Applet implements Runnable, ComponentListener{
	private int x,y;
	private int mx=2, my=3;
	private int width=200, height=300;
	private Graphics bg;//백그라운드 메모리 영역에 그래픽 처리를 할 객체
	private Image offScreen;//백그라운드 이미지 객체
	private Dimension dim;//화면의 가로,세로 사이즈를 저장하는 객체
	
	@Override
	public void init() {//Applet 초기화 메소드
		setSize(300, 300);//Applet 가로, 세로길이 설정
		dim = getSize();//Applet의 가로 세로길이를 Dimesion에 저장
		offScreen = createImage(dim.width, dim.height);//화면 사이즈만큼 백그라운드 그래픽 영역 생성
		bg=offScreen.getGraphics();//백그라운드 영역에 그래픽 처리를 하기 위한 객체 생성
		this.addComponentListener(this);//화면 변화 감지
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void paint(Graphics g) {//그래픽 처리
		bg.setColor(Color.blue);
		bg.fillRect(0, 0, getWidth(), getHeight());//사각형을 그리는 메소드
		bg.setColor(Color.green);
		bg.fillOval(x, y, 30, 30);
		//백그라운드 메모리에 출력된 그림을 화면에 출력
		g.drawImage(offScreen, 0, 0, this);
		//g.drawImage(이미지, x, y, 이미지관찰객체)
	}

	@Override
	public void run() {
		while(true) {//무한반복
			//x,y 좌표값 변경
			if(x > (width-30) || x<0) {//공이 벽에 맞았을 때 좌표가 오른쪽 벽에서  -30만큼 공포인터가 있어야하고 x가 음수가 되면 안된다.
				mx = -mx;//방향 반대로 바꿈, x축이 2씩 증가하던 것을 반대로 2씩 감소시킴
			}
			x = x+mx;//x좌표의 가중치 부여
			if(y > (height-30) || y<0) {//공이 하단벽에 맞았을 때 좌표가 하단벽에서  -30만큼 공포인터가 있어야하고 y가 음수가 되면 안된다.
				my = -my;//y축이 2씩 증가하던 것을 반대로 2씩 감소시킴
			}
			y = y+my;//y좌표의 가중치 부여
			repaint();//화면을 새로 그림 =>paint()가 호출됨
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	@Override
	public void componentResized(ComponentEvent e) {
		width = getWidth();//가로 사이즈를 get함
		height = getHeight();
		System.out.println("가로:"+width+"세로:"+height);
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


}
