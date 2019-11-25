package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam2 extends JFrame{
	public PanelExam2() {
		JPanel p = new JPanel();
		p.setBackground(Color.darkGray);
		JButton button1 = new JButton("남쪽1");
		JButton button2 = new JButton("중앙");
		JButton button3 = new JButton("북쪽");
		JButton button4 = new JButton("서쪽");
		JButton button5 = new JButton("동쪽");
		JButton button6 = new JButton("남쪽2");
		JButton button7 = new JButton("남쪽3");
		
		p.add(button1);
		p.add(button6);
		p.add(button7);
		add(p, BorderLayout.SOUTH);
		add(button2);
		add(button3, "North");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300,300);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PanelExam2();
	}

}
