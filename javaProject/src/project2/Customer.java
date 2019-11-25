package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private CustomerDAO dao;
	private JPasswordField tfPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(50, 45, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(50, 107, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfId = new JTextField();
		tfId.setBounds(150, 42, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(38, 164, 97, 23);
		contentPane.add(btnLogin);
		
		JButton btnNew = new JButton("회원가입");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerNew frm=new CustomerNew();
				frm.setVisible(true);
				frm.setLocation(400,400);
			}
		});
		btnNew.setBounds(200, 164, 97, 23);
		contentPane.add(btnNew);
		
		tfPwd = new JPasswordField();
		tfPwd.setBounds(150, 104, 116, 21);
		contentPane.add(tfPwd);
	}
}
