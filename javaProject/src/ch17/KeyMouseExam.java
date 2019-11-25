package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

//MouseListener : 마우스 이벤트 처리를 위한 인터페이스
//MouseMotionListener :  마우스 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드 이벤트 처리를 위한 인터페이스
public class KeyMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener{
	private int x,y;//이미지를 출력할 x,y 좌표
	private int width, height;//가로세로
	private Image img;//이미지 car.gif 사용할 변수
	private boolean flag=false;//이미지가 처음 실행 시 안보이게 불린 값으로 false를 씀
	
	//애플릿을 초기화 하는 코드
	@Override
	public void init() {
		setSize(300,300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);//현재 클래스에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseMotionListener(this);
		this.addKeyListener(this);//현재 클래스에 키보드(Key)이벤트 기능을 추가
		setFocusable(true);//키 입력을 받을 수 있도록 설정
		requestFocus();//현재 화면에 키 입력을 요청
	}
	@Override
	public void paint(Graphics g) {
	    super.paint(g);
	    //이미지의 가로,세로 길이 계산
	    width = img.getWidth(null);
	    height = img.getHeight(null);
	    System.out.println(width+","+height);
	    if(flag) {//마우스 클릭시 true로 바뀌면서 실행
	    	g.drawImage(img, x, y, this);
	    }
	}

	@Override
	public void keyTyped(KeyEvent e) {//키를 입력하면 호출
	}

	@Override
	public void keyPressed(KeyEvent e) {//키가 눌렀을 때 호출
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//문자
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP : y=Math.max(0, y-5); break; //위쪽 키를 눌렀을 때
		case KeyEvent.VK_DOWN : y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT : x=Math.max(0,x-5); break;
		case KeyEvent.VK_RIGHT : x=Math.min(300-width, x+5); break;
		}
		repaint();//그래픽 갱신 요청
	}

	@Override
	public void keyReleased(KeyEvent e) {//키를 땔 때에 호출
	}

	@Override
	public void mouseDragged(MouseEvent e) {//컴포넌트 상에서 마우스 버튼을 드래그했을 때 호출
		System.out.println("mouse drag_x:"+x+",y:"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {//마우스 커서가 컴포넌트 상에 이동했지만 버튼이 작동하지 않은 경우에 호출
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move_x:"+x+",y:"+y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {//컴포넌트 상에서 마우스 버튼을 클릭(눌렀다 놓을 때)했을 때 호출
		System.out.println(e);
		flag=true;//클릭할 때 그림을 true로 설정해서 보여지게 함.
		//마우스 클릭한 좌표 저장
		x = e.getX();//x좌표값을 가져옴
		y = e.getY();//y좌표값을 가져옴
		repaint();//paint()가 호출
		
	}

	@Override
	public void mousePressed(MouseEvent e) {//컴포넌트 상에서 마우스 버튼을 눌렀을 때 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {//컴포넌트 상에서 마우스 버튼을 떼어서 놓을 때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {//마우스가 컴포넌트 상에 들어갔을 때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {//마우스가 컴포넌트를 종료할 때 호출
	}

}
