package ch21_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EmpList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfDate;
	private JTextField tfSal;
	private JTextField tfSearch;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpList frame = new EmpList();
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
	public EmpList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 265, 488, 240);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("사번");
		lblNewLabel.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfNum = new JTextField();
		tfNum.setBounds(90, 7, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("사원명");
		lblNewLabel_1.setBounds(12, 44, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setBounds(90, 41, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("입사일");
		lblNewLabel_2.setBounds(12, 74, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfDate = new JTextField();
		tfDate.setBounds(90, 72, 116, 21);
		contentPane.add(tfDate);
		tfDate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("급여");
		lblNewLabel_3.setBounds(12, 107, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfSal = new JTextField();
		tfSal.setBounds(90, 103, 116, 21);
		contentPane.add(tfSal);
		tfSal.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("사원 번호를 입력하세요");
		lblNewLabel_4.setBounds(12, 168, 141, 32);
		contentPane.add(lblNewLabel_4);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(185, 174, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(262, 6, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(262, 44, 97, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(262, 81, 97, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(359, 173, 97, 23);
		contentPane.add(btnNewButton_3);
	}
}
