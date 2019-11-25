package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProjectPer extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ProjectDAO dao;
	private Vector col;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ProjectPer frame = new ProjectPer();
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
	public ProjectPer() {
		dao=new ProjectDAO();
		col=new Vector();
		col.add("학번");
		col.add("이름");
		col.add("출석");
		col.add("총결석");
		col.add("과정진행률(%)");
		col.add("나의출석률(%)");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 557, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학생별 출석률");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(213, 22, 90, 15);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 48, 541, 214);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		refreshTable();
	}
	public void refreshTable() {
		DefaultTableModel model=new DefaultTableModel(dao.per(), col);
		//테이블에 데이터 채워짐
		table.setModel(model);
	}
}
