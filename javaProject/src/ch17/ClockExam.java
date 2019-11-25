package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClockExam extends JFrame implements Runnable{

	private JPanel contentPane;
	private Calendar cal;
	private String str;
	private JLabel lblTime;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockExam frame = new ClockExam();
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
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTime = new JLabel("");
		lblTime.setForeground(Color.BLUE);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPane.add(lblTime, BorderLayout.CENTER);
		//백그라운드 스레드 생성
		Thread t = new Thread(this);
		t.start();
		
		JButton btnClose = new JButton("종료");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnClose, BorderLayout.SOUTH);
	}

	@Override
	public void run() {
		while(true) {
			//캘린더 인스턴스 생성(현재 시간 정보가 cal 변수에 저장
			cal=Calendar.getInstance();
			//%02d는 숫자 2자리, 빈자리는 0으로 채움
			str=String.format("%02d;%02d;%02d", cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
			//레이블에 시간 출력 setText(문자열)
			lblTime.setText(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
