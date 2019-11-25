package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProjectList3 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectList3 frame = new ProjectList3();
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
	public ProjectList3() {
		setTitle("융합소프트웨어2회차 출석부");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("담당교수 : 홍길동");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(185, 329, 128, 15);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 480, 33);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("융합소프트웨어개발자 2회차");
		panel.add(lblNewLabel_1);
		
		JButton btnAdd = new JButton("추가");
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("편집");
		panel.add(btnEdit);
		
		JButton btnper = new JButton("출석률");
		panel.add(btnper);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 53, 480, 266);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

}
