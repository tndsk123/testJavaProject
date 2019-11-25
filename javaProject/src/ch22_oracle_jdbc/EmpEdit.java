package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class EmpEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfDate;
	private JTextField tfSal;
	
	private EmpList2 parent;
	private EmpDAO dao;
	private EmpDTO dto;
	private String ename;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EmpEdit frame = new EmpEdit();
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
	public EmpEdit(EmpList2 parent, String ename) {
		this.parent=parent;
		this.ename=ename;
		System.out.println(parent);
		System.out.println(dto);
		
		setTitle("점수편집");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 280, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사원번호");
		lblNewLabel.setBounds(12, 22, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("사원명");
		lblNewLabel_1.setBounds(12, 65, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("입사일자");
		lblNewLabel_2.setBounds(12, 110, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("급여");
		lblNewLabel_3.setBounds(12, 160, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfNum = new JTextField();
		tfNum.setBounds(107, 19, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(107, 62, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfDate = new JTextField();
		tfDate.setBounds(107, 107, 116, 21);
		contentPane.add(tfDate);
		tfDate.setColumns(10);
		
		tfSal = new JTextField();
		tfSal.setBounds(107, 157, 116, 21);
		contentPane.add(tfSal);
		tfSal.setColumns(10);
		
		dao=new EmpDAO();
		dto=dao.viewEmp(ename);
		tfNum.setText(dto.getEmpno()+"");
		tfName.setText(dto.getEname());
		tfDate.setText(dto.getHiredate()+"");
		tfSal.setText(dto.getSal()+"");
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int empno=Integer.parseInt(tfNum.getText());
				String ename=tfName.getText();
				String hiredate=tfDate.getText();
				int sal=Integer.parseInt(tfSal.getText());
				EmpDTO dto=new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
				int result=dao.update(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(EmpEdit.this, "수정되었습니다.");
					parent.refreshTable();//ScoreList 갱신
					dispose();//현재 프레임을 닫는 Window 메소드
				}
			}
		});
		btnUpdate.setBounds(12, 237, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ename=tfName.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(EmpEdit.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					result=dao.delete(ename);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(EmpEdit.this, "삭제되었습니다.");
					parent.refreshTable();//ScoreList 갱신
					dispose();
				}
			}
		});
		btnDelete.setBounds(143, 237, 97, 23);
		contentPane.add(btnDelete);
		
	
		
	}
}
