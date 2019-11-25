package project;

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

public class ProjectSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfAttendance;
	private JTextField tfLate;
	private JTextField tfEarly;
	private JTextField tfGo_out;
	private JTextField tfAbsence;
	
	private ProjectList frm;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ProjectSave frame = new ProjectSave();
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
		
	public ProjectSave(ProjectList frm) {
		this();
		this.frm=frm;
	}
	
	public ProjectSave() {
		setTitle("정보 추가 프로그램");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 280, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("추가할 자료를 입력하세요");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(46, 10, 179, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setBounds(12, 48, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(100, 45, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(12, 88, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfName = new JTextField();
		tfName.setBounds(100, 85, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("출석");
		lblNewLabel_3.setBounds(12, 129, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfAttendance = new JTextField();
		tfAttendance.setBounds(100, 129, 116, 21);
		contentPane.add(tfAttendance);
		tfAttendance.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("지각");
		lblNewLabel_4.setBounds(12, 171, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		tfLate = new JTextField();
		tfLate.setBounds(100, 168, 116, 21);
		contentPane.add(tfLate);
		tfLate.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("조퇴");
		lblNewLabel_5.setBounds(12, 210, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		tfEarly = new JTextField();
		tfEarly.setBounds(100, 207, 116, 21);
		contentPane.add(tfEarly);
		tfEarly.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("외출");
		lblNewLabel_6.setBounds(12, 255, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		tfGo_out = new JTextField();
		tfGo_out.setBounds(100, 252, 116, 21);
		contentPane.add(tfGo_out);
		tfGo_out.setColumns(10);
		
		JButton btnSave = new JButton(" 저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no=tfStudentNo.getText();
				String name=tfName.getText();
				int attendance=Integer.parseInt(tfAttendance.getText());
				int late=Integer.parseInt(tfLate.getText()); 
				int early=Integer.parseInt(tfEarly.getText()); 
				int go_out=Integer.parseInt(tfGo_out.getText());
				int absence=Integer.parseInt(tfAbsence.getText());
				ProjectDTO dto=new ProjectDTO(student_no, name, attendance, late, early, go_out, absence);
				ProjectDAO dao=new ProjectDAO();
				int result=dao.insert(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(ProjectSave.this, "저장되었습니다.");
					frm.refreshTable();
					dispose();
				}
			}
		});
		btnSave.setBounds(74, 354, 97, 23);
		contentPane.add(btnSave);
		
		JLabel lblNewLabel_7 = new JLabel("결석");
		lblNewLabel_7.setBounds(12, 299, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		tfAbsence = new JTextField();
		tfAbsence.setBounds(100, 296, 116, 21);
		contentPane.add(tfAbsence);
		tfAbsence.setColumns(10);
	}
}
