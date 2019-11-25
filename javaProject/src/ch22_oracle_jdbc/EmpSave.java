package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class EmpSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfDate;
	private JTextField tfSal;
	
	private EmpList2 frm;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EmpSave frame = new EmpSave();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public EmpSave(EmpList2 frm) {
		this();
		this.frm=frm;
	}
	public EmpSave() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 290, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사원번호");
		lblNewLabel.setBounds(12, 21, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfNum = new JTextField();
		tfNum.setBounds(105, 18, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 61, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setBounds(105, 58, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("입사일자");
		lblNewLabel_2.setBounds(12, 107, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfDate = new JTextField();
		tfDate.setBounds(105, 104, 116, 21);
		contentPane.add(tfDate);
		tfDate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("급여");
		lblNewLabel_3.setBounds(12, 154, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfSal = new JTextField();
		tfSal.setBounds(105, 151, 116, 21);
		contentPane.add(tfSal);
		tfSal.setColumns(10);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int empno=Integer.parseInt(tfNum.getText());
				String ename=tfName.getText();
				String hiredate=tfDate.getText();
				int sal=Integer.parseInt(tfSal.getText());
				EmpDTO dto=new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
				EmpDAO dao=new EmpDAO();
				int result=dao.insert(dto);
				if(result==1) {JOptionPane.showMessageDialog(EmpSave.this, "저장되었습니다.");
				frm.refreshTable();
				dispose();
				}
			}
		});
		btnSave.setBounds(86, 225, 97, 23);
		contentPane.add(btnSave);
	}
}
