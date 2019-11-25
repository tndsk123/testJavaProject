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
import java.sql.Date;
import java.awt.event.ActionEvent;

public class MovieEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfType;
	private JTextField tfGrade;
	private JTextField tfOpen;
	private JTextField tfDirector;
	private JTextField tfAudience;
	
	private Manager2 frm;
	private MovieDTO dto;
	private MovieDAO dao;
	private String movie;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MovieEdit frame = new MovieEdit();
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
	public MovieEdit(Manager2 frm, String movie) {
		this.frm=frm;
		this.movie=movie;
		System.out.println(frm);
		System.out.println(movie);
		setTitle("영화정보 편집");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("편집 할 정보를 입력하세요");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setBounds(51, 10, 169, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("영화명");
		lblNewLabel_1.setBounds(12, 50, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("장르");
		lblNewLabel_2.setBounds(12, 100, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("평점");
		lblNewLabel_3.setBounds(12, 150, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("개봉일");
		lblNewLabel_4.setBounds(12, 200, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("감독");
		lblNewLabel_5.setBounds(12, 250, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("관객수");
		lblNewLabel_6.setBounds(12, 300, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		tfName = new JTextField();
		tfName.setBounds(119, 47, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfType = new JTextField();
		tfType.setBounds(119, 97, 116, 21);
		contentPane.add(tfType);
		tfType.setColumns(10);
		
		tfGrade = new JTextField();
		tfGrade.setBounds(119, 147, 116, 21);
		contentPane.add(tfGrade);
		tfGrade.setColumns(10);
		
		tfOpen = new JTextField();
		tfOpen.setBounds(119, 197, 116, 21);
		contentPane.add(tfOpen);
		tfOpen.setColumns(10);
		
		tfDirector = new JTextField();
		tfDirector.setBounds(119, 247, 116, 21);
		contentPane.add(tfDirector);
		tfDirector.setColumns(10);
		
		tfAudience = new JTextField();
		tfAudience.setBounds(119, 297, 116, 21);
		contentPane.add(tfAudience);
		tfAudience.setColumns(10);
		
		dao=new MovieDAO();
		dto=dao.view(movie);
		tfName.setText(dto.getMovie());
		tfType.setText(dto.getType());
		tfGrade.setText(dto.getGrade()+"");
		tfOpen.setText(dto.getOpen()+"");
		tfDirector.setText(dto.getDirector());
		tfAudience.setText(dto.getAudience()+"");
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String movie=tfName.getText();
				String type=tfType.getText();
				Double grade=Double.valueOf(tfGrade.getText());
				String open=tfOpen.getText();
				String director=tfDirector.getText();
				int audience=Integer.parseInt(tfAudience.getText());
				MovieDTO dto=new MovieDTO(movie, type, grade, Date.valueOf(open), director, audience);
				int result=dao.update(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(MovieEdit.this, "수정되었습니다.");
					frm.refreshTable2();
					dispose();
				}
			}
		});
		btnUpdate.setBounds(12, 352, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String movie=tfName.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(MovieEdit.this, "삭제하시겠습니까?");
			    if(response==JOptionPane.YES_OPTION) result=dao.delete(movie);
			    if(result==1) {
			    	JOptionPane.showMessageDialog(MovieEdit.this, "삭제되었습니다");
			    	frm.refreshTable2();
			    	dispose();
			    }
			}
		});
		btnDelete.setBounds(152, 352, 97, 23);
		contentPane.add(btnDelete);
	}
}
