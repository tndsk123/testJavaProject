package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.ProjectDAO;
import project.ProjectDTO;
import project.ProjectEdit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfId;
	private JTextField tfPwd;
	private JTextField tfAge;
	private JTextField tfPhone;
	
	private Manager2 frm;
	private CustomerDTO dto;
	private CustomerDAO dao;
	private String name;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ManagerEdit frame = new ManagerEdit();
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
	public ManagerEdit(Manager2 frm, String name) {
		this.frm=frm;
		this.name=name;
		System.out.println(frm);
		System.out.println(name);
		setTitle("고객정보 편집");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 286, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("편집 할 정보를 입력하세요");
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
		tfName.setBounds(115, 42, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.setBounds(115, 102, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfPwd = new JTextField();
		tfPwd.setBounds(115, 162, 116, 21);
		contentPane.add(tfPwd);
		tfPwd.setColumns(10);
		
		tfAge = new JTextField();
		tfAge.setBounds(115, 222, 116, 21);
		contentPane.add(tfAge);
		tfAge.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(115, 282, 116, 21);
		contentPane.add(tfPhone);
		tfPhone.setColumns(10);
		
		dao=new CustomerDAO();
		dto=dao.view(name);
		tfName.setText(dto.getName());
		tfId.setText(dto.getId());
		tfPwd.setText(dto.getPwd()+"");
		tfAge.setText(dto.getAge()+"");
		tfPhone.setText(dto.getPhone());
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfName.getText();
				String id=tfId.getText();
				String pwd=tfPwd.getText();
				int age=Integer.parseInt(tfAge.getText());
				String phone=tfPhone.getText();
				CustomerDTO dto=new CustomerDTO(name, id, pwd, age, phone);
				int result=dao.update(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(ManagerEdit.this, "수정되었습니다.");
					frm.refreshTable();
					dispose();
				}
			}
		});
		btnUpdate.setBounds(12, 327, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfName.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(ManagerEdit.this, "삭제하시겠습니까?");
			    if(response==JOptionPane.YES_OPTION) result=dao.delete(name);
			    if(result==1) {
			    	JOptionPane.showMessageDialog(ManagerEdit.this, "삭제되었습니다");
			    	frm.refreshTable();
			    	dispose();
			    }
			}
		});
		btnDelete.setBounds(161, 327, 97, 23);
		contentPane.add(btnDelete);
	}
}
