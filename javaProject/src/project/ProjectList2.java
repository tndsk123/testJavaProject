package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectList2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ProjectDAO2 dao;
	private Vector col;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectList2 frame = new ProjectList2();
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
	public ProjectList2() {
		dao=new ProjectDAO2();
		col=new Vector();
		col.add("학번");
		col.add("이름");
		col.add("출석");
		col.add("지각");
		col.add("조퇴");
		col.add("외출");
		col.add("결석");
		col.add("총결석");
		
		setTitle("융합소프트웨어2회차 출석부");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("담당교수 : 홍길동");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(185, 329, 128, 15);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 480, 33);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("융합소프트웨어개발자 2회차");
		panel.add(lblNewLabel_1);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectSave2 frm=new ProjectSave2(ProjectList2.this);
				frm.setVisible(true);
				frm.setLocation(200, 200);
			}
		});
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("편집");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx=table.getSelectedRow();
				System.out.println(idx);
				if(idx==-1) {
					JOptionPane.showMessageDialog(ProjectList2.this, "편집할 자료를 선택하세요.");
					return;
				}else {
					String student_no=String.valueOf(table.getValueAt(idx, 0));
					ProjectEdit2 frm=new ProjectEdit2(ProjectList2.this, student_no);
					frm.setVisible(true);
					frm.setLocation(200, 200);
				}
			}
		});
		panel.add(btnEdit);
		
		JButton btnper = new JButton("출석률");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectPer2 frm=new ProjectPer2();
				frm.setVisible(true);
				frm.setLocation(400,400);
			}
		});
		panel.add(btnper);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 53, 480, 266);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		refreshTable();
	}
	public void refreshTable() {
		DefaultTableModel model=new DefaultTableModel(dao.list(), col);
		table.setModel(model);
	}

}
