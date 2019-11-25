package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectSelect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectSelect frame = new ProjectSelect();
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
	public ProjectSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("(주) 미래능력개발교육원");
		label.setFont(new Font("굴림", Font.PLAIN, 17));
		label.setBounds(83, 24, 183, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("과정을 선택하세요");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 118, 127, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnFirst = new JButton("융합소프트웨어개발자 1회차");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectList frm= new ProjectList();
				frm.setVisible(true);
				frm.setLocation(400,400);
			}
		});
		btnFirst.setBounds(131, 60, 210, 23);
		contentPane.add(btnFirst);
		
		JButton btnSecond = new JButton("융합소프트웨어개발자 2회차");
		btnSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectList3 frm = new ProjectList3();
				frm.setVisible(true);
				frm.setLocation(400,400);
			}
		});
		btnSecond.setBounds(131, 114, 210, 23);
		contentPane.add(btnSecond);
		
		JButton btnThird = new JButton("융합소프트웨어개발자 3회차");
		btnThird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ProjectSelect.this, "아직 반이 개설되지 않았습니다.");
			}
		});
		btnThird.setBounds(131, 174, 210, 23);
		contentPane.add(btnThird);
	}

}
