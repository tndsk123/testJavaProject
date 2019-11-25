package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExamEx extends JFrame{
	private JButton red, blue, green, yellow, black;
	public EventExamEx() {
		setLayout(new FlowLayout());
		red = new JButton("red");
		blue = new JButton("blue");
		green = new JButton("green");
		yellow = new JButton("yellow");
		black = new JButton("black");
		
		add(red);
		add(blue);
		add(green);
		add(yellow);
		add(black);
				
		red.addActionListener(new MyColorAction2(this, Color.red));
		blue.addActionListener(new MyColorAction2(this, Color.blue));
		green.addActionListener(new MyColorAction2(this, Color.green));
		yellow.addActionListener(new MyColorAction2(this, Color.yellow));
		black.addActionListener(new MyColorAction2(this, Color.black));
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);				
	}
	
	public static void main(String[] args) {
		new EventExamEx();
	}

}
