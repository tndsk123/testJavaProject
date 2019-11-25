package project3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import ch21_jdbc.DB;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	
	private LoginDAO dao;
	private JPasswordField tfPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Manager Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.disabledForeground"));
		panel.setBounds(0, 0, 425, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MR02-28\\Desktop\\프로젝트\\11-20프로젝트\\사진\\배경.jpg"));
		lblNewLabel_2.setBounds(0, 0, 425, 482);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(148, 92, 57, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("User Id");
		lblNewLabel.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel.setBounds(479, 46, 106, 47);
		contentPane.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setForeground(Color.BLACK);
		tfId.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 23));
		tfId.setBounds(479, 103, 321, 60);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(479, 210, 122, 47);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn=null;
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					conn=DB.dbConn();
					String id=tfId.getText();
					String pwd=tfPwd.getText();
					String sql="select * from login where id=? and pwd=?";
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, id);
					pstmt.setString(2, pwd);
					rs=pstmt.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(Login.this, id+"님 환영합니다.");
						Select se=new Select();
						se.setVisible(true);
						se.setLocation(400,400);
						dispose();
					} else {
						JOptionPane.showMessageDialog(Login.this, "아이디 또는 패스워드를 다시 확인해주세요.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				} finally {
					try {
						if(rs!=null) rs.close();
						if(pstmt!=null) pstmt.close();
						if(conn!=null) conn.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
				
				
			}
		});
		btnLogin.setFont(new Font("Consolas", Font.BOLD, 20));
		btnLogin.setBackground(SystemColor.textHighlight);
		btnLogin.setBounds(479, 391, 321, 60);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.ORANGE);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_3.setBounds(830, 0, 42, 33);
		contentPane.add(lblNewLabel_3);
		
		tfPwd = new JPasswordField();
		tfPwd.setFont(new Font("굴림", Font.BOLD, 20));
		tfPwd.setBounds(479, 277, 321, 60);
		contentPane.add(tfPwd);
	}
}
