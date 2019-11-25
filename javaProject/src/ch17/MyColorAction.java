package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private JFrame f;
	private Color c;
	//component : 화면구성요소(프레임, 버튼, 라디오버튼 ...)
	//container : 다른 컴포넌트를 담을 수 있는 요소
	private Container con;
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}
	
    //버튼을 클릭할 때 호출하는 메소드 actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
	}

}
