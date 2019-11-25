package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckboxExam1 extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxExam1 frame = new CheckboxExam1();
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
	public CheckboxExam1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JCheckBox ckJava = new JCheckBox("Java");
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {//체크박스에 체크,언체크 ==> itemStateChanged 자동호출
				System.out.println(e.getStateChange());//getStateChange() 체크박스에 체크상태를 가져오는 메소드
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("Java를 신청했습니다.\n");
				}else {//언체크(자동 DESELECTED 처리)
					ta.append("Java를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckC = new JCheckBox("C");
		ckC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("C를 신청했습니다.\n");
				}else {
					ta.append("C를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckC);
		
		JCheckBox ckIoT = new JCheckBox("IoT");
		ckIoT.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("IoT를 신청했습니다.\n");
				}else {
					ta.append("IoT를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckIoT);
		
		JCheckBox ckDB = new JCheckBox("DB");
		ckDB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("DB를 신청했습니다.\n");
				}else {
					ta.append("DB를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckDB);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JButton btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);
	}

}
