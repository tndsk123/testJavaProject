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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfAttendance;
	private JTextField tfLate;
	private JTextField tfEarly;
	private JTextField tfGo_out;
	private JTextField tfAbsence;
	
	private ProjectList frm;
	private ProjectDTO dto;
	private ProjectDAO dao;
	private String student_no;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ProjectEdit frame = new ProjectEdit();
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
	public ProjectEdit(ProjectList frm, String student_no) {
		this.frm=frm;
		this.student_no=student_no;
		System.out.println(frm);
		System.out.println(student_no);
		
		setTitle("정보 편집프로그램");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 280, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("정보를 편집하세요");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(69, 10, 139, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setBounds(12, 44, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(104, 41, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(12, 87, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfName = new JTextField();
		tfName.setBounds(104, 84, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("출석");
		lblNewLabel_3.setBounds(12, 135, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfAttendance = new JTextField();
		tfAttendance.setBounds(104, 132, 116, 21);
		contentPane.add(tfAttendance);
		tfAttendance.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("지각");
		lblNewLabel_4.setBounds(12, 181, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		tfLate = new JTextField();
		tfLate.setBounds(104, 178, 116, 21);
		contentPane.add(tfLate);
		tfLate.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("조퇴");
		lblNewLabel_5.setBounds(12, 229, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		tfEarly = new JTextField();
		tfEarly.setBounds(104, 226, 116, 21);
		contentPane.add(tfEarly);
		tfEarly.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("외출");
		lblNewLabel_6.setBounds(12, 271, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		tfGo_out = new JTextField();
		tfGo_out.setBounds(104, 268, 116, 21);
		contentPane.add(tfGo_out);
		tfGo_out.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("결석");
		lblNewLabel_7.setBounds(12, 313, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		tfAbsence = new JTextField();
		tfAbsence.setBounds(104, 310, 116, 21);
		contentPane.add(tfAbsence);
		tfAbsence.setColumns(10);
		
		dao=new ProjectDAO();
		dto=dao.view(student_no);
		tfStudentNo.setText(dto.getStudent_no());
		tfName.setText(dto.getName());
		tfAttendance.setText(dto.getAttendance()+"");
		tfLate.setText(dto.getLate()+"");
		tfEarly.setText(dto.getEarly()+"");
		tfGo_out.setText(dto.getGo_out()+"");
		tfAbsence.setText(dto.getAbsence()+"");
			
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no=tfStudentNo.getText();
				String name=tfName.getText();
				int attendance=Integer.parseInt(tfAttendance.getText());
				int late=Integer.parseInt(tfLate.getText()); 
				int early=Integer.parseInt(tfEarly.getText()); 
				int go_out=Integer.parseInt(tfGo_out.getText());
				int absence=Integer.parseInt(tfAbsence.getText());
				ProjectDTO dto=new ProjectDTO(student_no, name, attendance, late, early, go_out, absence);
				int result=dao.update(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(ProjectEdit.this, "수정되었습니다.");
					frm.refreshTable();
					dispose();
				}
			}
		});
		btnUpdate.setBounds(23, 353, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no=tfStudentNo.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(ProjectEdit.this, "삭제하시겠습니까?");
			    if(response==JOptionPane.YES_OPTION) result=dao.delete(student_no);
			    if(result==1) {
			    	JOptionPane.showMessageDialog(ProjectEdit.this, "삭제되었습니다");
			    	frm.refreshTable();
			    	dispose();
			    }
			}
		});
		btnDelete.setBounds(142, 353, 97, 23);
		contentPane.add(btnDelete);
	}

}
