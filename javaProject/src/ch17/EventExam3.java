package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExam3 extends JFrame{
	private JButton button1,button2,button3,button4,button5,button6;
	
	public EventExam3() {
		//플로우 레이아웃
		setLayout(new FlowLayout());
		button1 = new JButton("Red");
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//모든 창을 닫음
	}
	public static void main(String[] args) {
		new EventExam3();
	}

}
