package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuExam frame = new MenuExam();
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
	public MenuExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("파일");
		menuBar.add(menuFile);
		
		JMenuItem miNewFile = new JMenuItem("새 파일");
		miNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MenuExam.this, "새 파일 메뉴를 눌렀습니다.");
			}
		});
		menuFile.add(miNewFile);
		
		JMenuItem miOpen = new JMenuItem("열기");
		menuFile.add(miOpen);
		
		JMenuItem miSave = new JMenuItem("저장");
		menuFile.add(miSave);
		
		JMenuItem miExit = new JMenuItem("종료");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MenuExam.this, "종료할까요?");
					if(result==JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(MenuExam.this, "프로그램을 종료합니다.");
						System.exit(0);
					}
			}
		});
		menuFile.add(miExit);
		
		JMenu menuColor = new JMenu("색상");
		menuBar.add(menuColor);
		
		JMenuItem miRed = new JMenuItem("Red");
		miRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.red);
			}
		});
		menuColor.add(miRed);
		
		JMenuItem miGreen = new JMenuItem("Green");
		miGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.green);
			}
		});
		
		menuColor.add(miGreen);
		
		JMenuItem miBlue = new JMenuItem("Blue");
		miBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.blue);
			}
		});
		menuColor.add(miBlue);
		
		
		JMenu menuHelp = new JMenu("도움말");
		menuBar.add(menuHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
