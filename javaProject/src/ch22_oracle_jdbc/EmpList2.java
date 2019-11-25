package ch22_oracle_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EmpList2 extends JFrame {

	private JPanel contentPane;
	
	private EmpDAO dao;
	private Vector col;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpList2 frame = new EmpList2();
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
	public EmpList2() {
		dao = new EmpDAO();
		col=new Vector();
		col.add("사원번호");
		col.add("사원명");
		col.add("입사일자");
		col.add("급여");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmpSave frm=new EmpSave(EmpList2.this);
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
				if(idx == -1) {
					JOptionPane.showMessageDialog(EmpList2.this, "편집할 자료를 선택하세요.");
					return; 
				}else {
					String ename=String.valueOf(table.getValueAt(idx, 0));
					EmpEdit frm=new EmpEdit(EmpList2.this, ename);
					frm.setVisible(true);
					frm.setLocation(550, 100);
				}
			}
		});
		panel.add(btnEdit);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	public void refreshTable() {
		DefaultTableModel model=new DefaultTableModel(dao.list(), col);
	    table.setModel(model);
	}
	

}
