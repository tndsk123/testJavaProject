package project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfPwd;
	private JTextField tfName;
	private JTextField tfBirth;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private JTextField tfAddress;
	private Customer frm;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CustomerSave frame = new CustomerSave();
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
	public CustomerSave(Customer frm) {
		this();
		this.frm=frm;
	}
	public CustomerSave() {
		setTitle("Customer Information Add");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 257, 473);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Customer");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 0, 141, 37);
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
		tfId.setBounds(100, 55, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfPwd = new JTextField();
		tfPwd.setBounds(100, 106, 116, 21);
		contentPane.add(tfPwd);
		tfPwd.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(100, 150, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfBirth = new JTextField();
		tfBirth.setBounds(100, 195, 116, 21);
		contentPane.add(tfBirth);
		tfBirth.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(100, 247, 116, 21);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(100, 297, 116, 21);
		contentPane.add(tfPhone);
		tfPhone.setColumns(10);
		
		tfAddress = new JTextField();
		tfAddress.setBounds(100, 355, 116, 21);
		contentPane.add(tfAddress);
		tfAddress.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tfId.getText();
				String pwd=tfPwd.getText();
				String name=tfName.getText();
				String birth=tfBirth.getText();
				String email=tfEmail.getText();
				String phone=tfPhone.getText();
				String address=tfAddress.getText();
			    CusDTO dto=new CusDTO(id, pwd, name, birth, email, phone, address);
			    CusDAO dao=new CusDAO();
			    int result=dao.insert(dto);
			    if(result==1) {
					JOptionPane.showMessageDialog(CustomerSave.this, "저장되었습니다.");
					frm.refreshTable();
					dispose();
			    }
			}
		});
		btnSave.setFont(new Font("Raavi", Font.PLAIN, 15));
		btnSave.setBounds(68, 402, 97, 23);
		contentPane.add(btnSave);
		

	}
}
