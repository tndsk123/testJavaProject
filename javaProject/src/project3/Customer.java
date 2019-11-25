package project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ch22_oracle_jdbc.ScoreDAO;
import ch22_oracle_jdbc.ScoreEdit;
import ch22_oracle_jdbc.ScoreList;
import ch22_oracle_jdbc.ScoreSave;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private CusDAO dao;
	private Vector col;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Customer frame = new Customer();
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
	public Customer() {
		dao=new CusDAO();
		col=new Vector();
		col.add("Id");
		col.add("Pwd");
		col.add("Name");
		col.add("Birth");
		col.add("Email");
		col.add("Phone");
		col.add("Address");
		
		setTitle("Customer List");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 830, 531);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Management");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 0, 304, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer\r\n");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 22));
		lblNewLabel_1.setBounds(0, 122, 122, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Infomation");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 22));
		lblNewLabel_2.setBounds(0, 187, 122, 62);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 74, 670, 356);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		refreshTable();
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CustomerSave frm=new CustomerSave(Customer.this);
				frm.setVisible(true);
				frm.setLocation(200, 200);
			}
		});
		lblAdd.setFont(new Font("Raavi", Font.BOLD, 19));
		lblAdd.setBounds(235, 440, 98, 33);
		contentPane.add(lblAdd);
		
		JLabel lblUpdate = new JLabel("Update");
		lblUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				System.out.println(idx);
				if(idx == -1) {
					JOptionPane.showMessageDialog(Customer.this, "편집할 자료를 선택하세요.");
					return; 
				}else {
					String id=String.valueOf(table.getValueAt(idx, 0));
					CustomerEdit frm=new CustomerEdit(Customer.this,id);
					frm.setVisible(true);
					frm.setLocation(550, 100);
				}
			
			}
		});
		lblUpdate.setFont(new Font("Raavi", Font.BOLD, 19));
		lblUpdate.setBounds(540, 440, 98, 33);
		contentPane.add(lblUpdate);
	}
	public void refreshTable() {
		DefaultTableModel model=new DefaultTableModel(dao.list(), col);
		table.setModel(model);
	}
}
