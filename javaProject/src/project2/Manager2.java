package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import project.ProjectDAO;
import project.ProjectEdit;
import project.ProjectList;
import project.ProjectSave;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Manager2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private CustomerDAO dao;
	private MovieDAO dao2;
	private Vector col;
	private Vector col2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager2 frame = new Manager2();
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
	public Manager2() {
		setTitle("관리자용 프로그램");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 618, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JButton btnNewButton = new JButton("고객관리");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao=new CustomerDAO();
				col=new Vector();
				col.add("이름");
				col.add("아이디");
				col.add("비밀번호");
				col.add("나이");
				col.add("번호");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 51, 578, 247);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				refreshTable();
				
				JButton btnAdd = new JButton("추가");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ManagerSave frm=new ManagerSave(Manager2.this);
						frm.setVisible(true);
						frm.setLocation(200, 200);
					}
				});
				btnAdd.setBounds(112, 308, 97, 23);
				contentPane.add(btnAdd);
				
				JButton btnEdit = new JButton("편집");
				btnEdit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int idx=table.getSelectedRow();
						System.out.println(idx);
						if(idx==-1) {
							JOptionPane.showMessageDialog(Manager2.this, "편집할 자료를 선택하세요.");
							return;
						}else {
							String name=String.valueOf(table.getValueAt(idx, 0));
							ManagerEdit frm=new ManagerEdit(Manager2.this, name);
							frm.setVisible(true);
							frm.setLocation(200, 200);
						}
					}
				});
				btnEdit.setBounds(350, 308, 97, 23);
				contentPane.add(btnEdit);
			}
		});
		btnNewButton.setBounds(112, 10, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("영화관리");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dao2=new MovieDAO();
				col2=new Vector();
				col2.add("영화명");
				col2.add("장르");
				col2.add("별점");
				col2.add("개봉일");
				col2.add("감독");
				col2.add("총관객");
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 51, 578, 247);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				refreshTable2();
				
				JButton btnAdd = new JButton("추가");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MovieSave frm=new MovieSave(Manager2.this);
						frm.setVisible(true);
						frm.setLocation(200, 200);
					}
				});
				btnAdd.setBounds(112, 308, 97, 23);
				contentPane.add(btnAdd);
				
				JButton btnEdit = new JButton("편집");
				btnEdit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int idx=table.getSelectedRow();
						System.out.println(idx);
						if(idx==-1) {
							JOptionPane.showMessageDialog(Manager2.this, "편집할 자료를 선택하세요.");
							return;
						}else {
							String movie=String.valueOf(table.getValueAt(idx, 0));
							MovieEdit frm=new MovieEdit(Manager2.this, movie);
							frm.setVisible(true);
							frm.setLocation(200, 200);
						}
					}
				});
				btnEdit.setBounds(350, 308, 97, 23);
				contentPane.add(btnEdit);
				
			}
		});
		btnNewButton_1.setBounds(347, 10, 97, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
	public void refreshTable() {
		DefaultTableModel model=new DefaultTableModel(dao.list(), col);
		table.setModel(model);
	}
	public void refreshTable2() {
		DefaultTableModel model=new DefaultTableModel(dao2.list(), col2);
		table.setModel(model);
	}
}
