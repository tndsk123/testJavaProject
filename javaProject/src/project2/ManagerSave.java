package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.ProjectDAO;
import project.ProjectDTO;
import project.ProjectList;
import project.ProjectSave;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerSave extends JFrame {

	private JPanel contentPane;
	private Manager2 frm;
	private JTextField tfName;
	private JTextField tfId;
	private JTextField tfPwd;
	private JTextField tfAge;
	private JTextField tfPhone;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ManagerSave frame = new ManagerSave();
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
	public ManagerSave(Manager2 frm) {
		this();
		this.frm=frm;
	}
	public ManagerSave() {
		setTitle("고객정보 추가");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 286, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("추가 할 정보를 입력하세요");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setBounds(51, 10, 169, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 45, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 105, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("비밀번호");
		lblNewLabel_5.setBounds(12, 165, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(12, 225, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("번호");
		lblNewLabel_3.setBounds(12, 285, 57, 15);
		contentPane.add(lblNewLabel_3);
		
				
		tfName = new JTextField();
		tfName.setBounds(119, 42, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.setBounds(119, 102, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfPwd = new JTextField();
		tfPwd.setBounds(119, 162, 116, 21);
		contentPane.add(tfPwd);
		tfPwd.setColumns(10);
		
		tfAge = new JTextField();
		tfAge.setBounds(119, 222, 116, 21);
		contentPane.add(tfAge);
		tfAge.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(119, 282, 116, 21);
		contentPane.add(tfPhone);
		tfPhone.setColumns(10);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfName.getText();
				String id=tfId.getText();
				String pwd=tfPwd.getText();
				int age=Integer.parseInt(tfAge.getText());
				String phone=tfPhone.getText();
				CustomerDTO dto=new CustomerDTO(name, id, pwd, age, phone);
				CustomerDAO dao=new CustomerDAO();
				int result=dao.insert(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(ManagerSave.this, "저장되었습니다.");
					frm.refreshTable();
					dispose();
				}
			}
		});
		btnSave.setBounds(77, 329, 97, 23);
		contentPane.add(btnSave);
		
		
	}
}
