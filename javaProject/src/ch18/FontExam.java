package ch18;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font;
	private FontMetrics fm;
	private int x,y;
	private String message;
	private Dimension dim;
	
	@Override
	public void init() {
		message = "그래픽 테스트";
		font = new Font("굴림",font.ITALIC,30);//new Font("폰트",옵션,사이즈)
		fm = getFontMetrics(font);//폰트의 가로 세로 사이즈를 가져오는 메소드
		setSize(250,250);
		dim = getSize();//화면의 크기 계산해서 Dimension에 저장
		System.out.println(dim.width);//현재화면의 가로사이즈
		System.out.println(dim.height);//현재화면의 세로사이즈
		//문자열의 가로, 세로 길이를 계산해서 화면의 중앙에 위치
		x=(dim.width/2)-(fm.stringWidth(message)/2);//폰트의 가로길이 값
		y=(dim.height/2)-(fm.getDescent()/2);//폰트의 세로길이 값
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);//폰트 설정
		//문자열 출력
		g.drawString(message, x, y);
	}

}
