package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import project.ProjectList2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Manager extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	
	private ManagerDAO dao;
	private JPasswordField tfPwd;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		setTitle("관리자용");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 364, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(52, 50, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(52, 103, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfId = new JTextField();
		tfId.setBounds(152, 47, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tfId.getText();
				Vector a=new Vector();
				a.add(id);
				String pwd=tfPwd.getText();
				Vector b=new Vector();
				b.add(pwd);
				ManagerDAO dao=new ManagerDAO();
				if(a==dao.id() && b==dao.pwd()) {
					JOptionPane.showMessageDialog(Manager.this, "로그인 되었습니다.");
					Manager2 frm = new Manager2();
					frm.setVisible(true);
					frm.setLocation(400,400);
						
				}else {
						JOptionPane.showMessageDialog(Manager.this, "아이디 또는 패스워드가 일치하지 않습니다.");
					}
				
			}
		});
		btnLogin.setBounds(119, 153, 97, 23);
		contentPane.add(btnLogin);
		
		tfPwd = new JPasswordField();
		tfPwd.setBounds(152, 100, 116, 21);
		contentPane.add(tfPwd);
	
		
		
	}
}
