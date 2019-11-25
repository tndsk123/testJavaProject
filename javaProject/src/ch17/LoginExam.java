package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class LoginExam extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;
	//추가
	private Map<String,String> map;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam frame = new LoginExam();
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
	public LoginExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("아이디");
		label.setBounds(67, 79, 57, 15);
		contentPane.add(label);
		
		userid = new JTextField();
		userid.setBounds(165, 76, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("패스워드");
		lblNewLabel.setBounds(67, 128, 57, 15);
		contentPane.add(lblNewLabel);
		
		pwd = new JPasswordField();
		pwd.setBounds(165, 125, 116, 21);
		contentPane.add(pwd);
		
		map = new HashMap<>();
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userid.getText();
				//String pw = pwd.getText();//권장하지 않는 메소드
				String pw = String.valueOf(pwd.getPassword());
				String strId = map.get(id);
				//널밧으로 인한 exception이 있을 땐 아래처럼 null처리 코드도 추가해 주면 좋다.
				if(strId != null && strId.equals(pw)) {
					lblResult.setForeground(Color.blue);
					lblResult.setText(id+"님 환영합니다.");
				}else {
					lblResult.setForeground(Color.red);
					lblResult.setText("아이디 또는 패스워드가 일치하지 않습니다.");
				}
			}
		});
		btnLogin.setBounds(173, 174, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("굴림", Font.PLAIN, 15));
		lblResult.setBounds(67, 213, 315, 23);
		contentPane.add(lblResult);
	}
}
