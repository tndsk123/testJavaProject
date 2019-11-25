package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioExam extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioExam frame = new RadioExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdoRed = new JRadioButton("Red");
		buttonGroup_1.add(rdoRed);
		rdoRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		contentPane.add(rdoRed);
		
		JRadioButton rdoGreen = new JRadioButton("Green");
		buttonGroup_1.add(rdoGreen);
		rdoGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		contentPane.add(rdoGreen);
		
		JRadioButton rdoBlue = new JRadioButton("Blue");
		buttonGroup_1.add(rdoBlue);
		rdoBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		contentPane.add(rdoBlue);
		
		JRadioButton rdoCyan = new JRadioButton("Cyan");
		buttonGroup_1.add(rdoCyan);
		rdoCyan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.cyan);
			}
		});
		contentPane.add(rdoCyan);
		
		JRadioButton rdopink = new JRadioButton("Pink");
		buttonGroup_1.add(rdopink);
		rdopink.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.pink);
			}
		});
		contentPane.add(rdopink);
		
		JRadioButton rdogray = new JRadioButton("Gray");
		buttonGroup_1.add(rdogray);
		rdogray.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.gray);
			}
		});
		contentPane.add(rdogray);
	}

}
