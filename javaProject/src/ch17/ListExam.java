package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListExam extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	//추가
	private DefaultListModel model;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListExam frame = new ListExam();
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
	public ListExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		tf = new JTextField();
		tf.setToolTipText("");
		panel.add(tf);
		tf.setColumns(10);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(tf.getText());
				//텍스트필드.getText() 입력된 내용을 꺼낼때
				//텍스트필드.setText("입력할 내용")
				list.setModel(model);//데이터 모델 갱신
				tf.setText("");//텍스트 클리어
				tf.requestFocus();
			}
		});
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex=list.getSelectedIndex();
				if(selectedIndex != -1) {//선택된 값이 없으면 -1
					System.out.println(selectedIndex);
					model.remove(selectedIndex);
				}
			}
		});
		panel.add(btnDelete);
		
		//데이터 모델 생성
		model = new DefaultListModel<>();
        model.addElement("서울");
        model.addElement("인천");
        model.addElement("부산");
        model.addElement("대전");
        model.addElement("춘천");
		
		list = new JList(model);
		contentPane.add(list, BorderLayout.CENTER);
	}

}
