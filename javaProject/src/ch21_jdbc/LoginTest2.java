package ch21_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginTest2 extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest2 frame = new LoginTest2();
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
	public LoginTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(62, 41, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(62, 201, 266, 23);
		contentPane.add(lblResult);
		
		userid = new JTextField();
		userid.setBounds(171, 38, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setBounds(62, 91, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String strUserid = userid.getText();
				String strPwd = String.valueOf(pwd.getPassword());
				Connection conn = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				try {
					FileInputStream fis = new FileInputStream("d:\\db2.prop");
					Properties prop = new Properties();
					prop.load(fis);
					String url = prop.getProperty("url");
					String id = prop.getProperty("id");
					String password = prop.getProperty("password");
					
					conn = DriverManager.getConnection(url,id,password);
					String sql = "SELECT * FROM member WHERE userid=? AND pwd =?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, strUserid);
					ps.setString(2, strPwd);
					rs = ps.executeQuery();
					if(rs.next()) {//레코드가 존재하면
						lblResult.setText(rs.getString("name")+"님 환영합니다.");
					}else {
						lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if(rs!=null)
							rs.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					try {
						if(ps!=null)
							ps.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					try {
						if(conn!=null)
							conn.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
			}
		});
		btnLogin.setBounds(127, 148, 97, 23);
		contentPane.add(btnLogin);
		
		
		
		pwd = new JPasswordField();
		pwd.setBounds(171, 88, 116, 21);
		contentPane.add(pwd);
	}
}
