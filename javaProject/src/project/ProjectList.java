package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ProjectDAO dao;
	private Vector col;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectList frame = new ProjectList();
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
	public ProjectList() {
		dao=new ProjectDAO();
		col=new Vector();
		col.add("학번");
		col.add("이름");
		col.add("출석");
		col.add("지각");
		col.add("조퇴");
		col.add("외출");
		col.add("결석");
		col.add("총결석");
		
		setTitle("융합소프트웨어1회차 출석부");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 492, 38);
		contentPane.add(panel);
		
		JLabel label = new JLabel("융합소프트웨어개발자 1회차");
		panel.add(label);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectSave frm=new ProjectSave(ProjectList.this);
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
					JOptionPane.showMessageDialog(ProjectList.this, "편집할 자료를 선택하세요.");
					return;
				}else {
					String student_no=String.valueOf(table.getValueAt(idx, 0));
					ProjectEdit frm=new ProjectEdit(ProjectList.this, student_no);
					frm.setVisible(true);
					frm.setLocation(200, 200);
				}
			}
		});
		panel.add(btnEdit);
		
		JButton btnper = new JButton("출석률");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectPer frm=new ProjectPer();
				frm.setVisible(true);
				frm.setLocation(400,400);
			}
		});
		panel.add(btnper);
		
		JLabel lblNewLabel = new JLabel("담당교수 : 김시현");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(179, 329, 139, 15);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 58, 492, 261);
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
