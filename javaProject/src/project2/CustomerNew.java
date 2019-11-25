package project2;

import java.awt.BorderLayout;
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
import javax.swing.JPasswordField;

public class CustomerNew extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfId;
	private JTextField tfAge;
	private JTextField tfPhone;
	private JPasswordField tfPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerNew frame = new CustomerNew();
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
	public CustomerNew() {
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보를 등록해주세요");
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
		tfName.setBounds(104, 42, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.setBounds(104, 102, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfAge = new JTextField();
		tfAge.setBounds(104, 222, 116, 21);
		contentPane.add(tfAge);
		tfAge.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(104, 282, 116, 21);
		contentPane.add(tfPhone);
		tfPhone.setColumns(10);
		
		JButton btnNew = new JButton("회원가입");
		btnNew.addActionListener(new ActionListener() {
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
					JOptionPane.showMessageDialog(CustomerNew.this, "회원가입이 완료되었습니다. 로그인해 주세요");
					dispose();
				}
			}			
		});
		btnNew.setBounds(75, 338, 97, 23);
		contentPane.add(btnNew);
		
		tfPwd = new JPasswordField();
		tfPwd.setBounds(104, 162, 116, 21);
		contentPane.add(tfPwd);
	}
}
