package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	public PanelExam() {
		//패널에는 2개 이상의 컴포넌트를 배치할 수 있음
		//패널에 여러개의 컴포넌트를 배치한 후 프레임에 패널을 붙으면 1개를 붙인 효과가 됨
		JPanel p = new JPanel();
		p.setBackground(Color.red);//패널의 배경색상 설정
		JButton button1 = new JButton("버튼1");//버튼 생성
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		JButton button7 = new JButton("버튼7");
		
		//여러개의 버튼을 배치하려면 반드시 종속컨테이너인 패널에 add해서 배치해야한다.
		p.add(button1);//버튼을 패널에 붙임
		p.add(button6);
		p.add(button7);
		add(p, BorderLayout.NORTH);
		add(button2);//위치를 생략하면 Center로 배치
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300,300);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//윈도우 닫기 버튼을 눌렀을 때의 동작(완전 종료)
	}
	
	public static void main(String[] args) {
		new PanelExam();//생성자는 메소드와 달리 생성과 동시에 호출하기 때문에 참조변수 생략가능
	}

}
