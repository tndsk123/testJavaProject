package project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfPwd;
	private JTextField tfName;
	private JTextField tfBirth;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private JTextField tfAddress;
	private Customer parent;
	private CusDTO dto;
	private CusDAO dao;
	private String id;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CustomerEdit frame = new CustomerEdit();
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
	public CustomerEdit(Customer parent,String id) {
		setTitle("Customer Information Edit");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 257, 473);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Customer");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(41, 0, 168, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 60, 57, 15);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Pwd");
		lblNewLabel_2.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(12, 106, 57, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 150, 57, 15);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Birth");
		lblNewLabel_4.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(12, 200, 69, 15);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(12, 252, 57, 15);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(12, 360, 57, 15);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(12, 302, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		tfId = new JTextField();
		tfId.setBounds(93, 55, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfPwd = new JTextField();
		tfPwd.setBounds(93, 101, 116, 21);
		contentPane.add(tfPwd);
		tfPwd.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(93, 145, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfBirth = new JTextField();
		tfBirth.setBounds(93, 195, 116, 21);
		contentPane.add(tfBirth);
		tfBirth.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(93, 247, 116, 21);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(93, 297, 116, 21);
		contentPane.add(tfPhone);
		tfPhone.setColumns(10);
		
		tfAddress = new JTextField();
		tfAddress.setBounds(93, 355, 116, 21);
		contentPane.add(tfAddress);
		tfAddress.setColumns(10);
		
		dao=new CusDAO();
		dto=dao.view(id);
		tfId.setText(dto.getId());
		tfPwd.setText(dto.getPwd());
		tfName.setText(dto.getName());		
		tfBirth.setText(dto.getBirth());
		tfEmail.setText(dto.getEmail());
		tfPhone.setText(dto.getPhone());
		tfAddress.setText(dto.getAddress());
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tfId.getText();
				String pwd=tfPwd.getText();
				String name=tfName.getText();
				String birth=tfBirth.getText();
				String email=tfEmail.getText();
				String phone=tfPhone.getText();
				String address=tfAddress.getText();
			    CusDTO dto=new CusDTO(id, pwd, name, birth, email, phone, address);
			    int result= dao.update(dto);
			    if(result==1) {
			    	JOptionPane.showMessageDialog(CustomerEdit.this, "수정되었습니다.");
			    	parent.refreshTable();
			    	dispose();
			    }
			}
		});
		btnUpdate.setBounds(0, 402, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tfId.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(CustomerEdit.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					result=dao.delete(id);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(CustomerEdit.this, "삭제되었습니다.");
					parent.refreshTable();
					dispose();
				}
			}
		});
		btnDelete.setBounds(144, 402, 97, 23);
		contentPane.add(btnDelete);
	}
}
