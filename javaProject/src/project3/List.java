package project3;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ch22_oracle_jdbc.ScoreEdit;
import ch22_oracle_jdbc.ScoreList;
import project2.Manager2;
import project2.MovieSave;

public class List extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private InvenDAO dao;
	private Vector v;
	private Vector v1;
	private Vector v2;
	private Vector v3;
	private Vector v4;
	private Vector v5;

	private InvenDTO dto;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					List frame = new List();
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
	public List() {
		dao=new InvenDAO();
		v=new Vector();
		v.add("Product");
		v.add("Name");
		v.add("Size");
		v.add("Company");
		v.add("Made");
		v.add("Date");
		v.add("Price");
		v.add("Amount");
		
		setTitle("Product List");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 830, 531);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory Management");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 0, 304, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("All");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dao=new InvenDAO();
				v=new Vector();
				v.add("product");
				v.add("name");
				v.add("size");
				v.add("company");
				v.add("made");
				v.add("date");
				v.add("price");
				v.add("amount");

				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(122, 53, 680, 387);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
			    abcd();
			}
		});
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 78, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOuter = new JLabel("Outer");
		lblOuter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dao=new InvenDAO();
				v1=new Vector();
				v1.add("product");
				v1.add("name");
				v1.add("size");
				v1.add("company");
				v1.add("made");
				v1.add("date");
				v1.add("price");
				v1.add("amount");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(122, 53, 680, 387);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
			    Outer();
			    			
			}
		});
		lblOuter.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		lblOuter.setBounds(12, 129, 98, 31);
		contentPane.add(lblOuter);
		
		JLabel lblTop = new JLabel("Top");
		lblTop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				dao=new InvenDAO();		
				v2=new Vector();
				v2.add("product");
				v2.add("name");
				v2.add("size");
				v2.add("company");
				v2.add("made");
				v2.add("date");
				v2.add("price");
				v2.add("amount");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(122, 53, 680, 387);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				Top();
				
			}
		});
		lblTop.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		lblTop.setBounds(12, 193, 57, 31);
		contentPane.add(lblTop);
		
		JLabel lblBottom = new JLabel("Bottom");
		lblBottom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dao=new InvenDAO();
				v3=new Vector();
				v3.add("product");
				v3.add("name");
				v3.add("size");
				v3.add("company");
				v3.add("made");
				v3.add("date");
				v3.add("price");
				v3.add("amount");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(122, 53, 680, 387);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				Bottom();
				
			}
		});
		lblBottom.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		lblBottom.setBounds(12, 260, 67, 31);
		contentPane.add(lblBottom);
		
		JLabel lblShoes = new JLabel("Shoes");
		lblShoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dao=new InvenDAO();
				v4=new Vector();
				v4.add("product");
				v4.add("name");
				v4.add("size");
				v4.add("company");
				v4.add("made");
				v4.add("date");
				v4.add("price");
				v4.add("amount");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(122, 53, 680, 387);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				Shoes();
			
			}
		});
		lblShoes.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		lblShoes.setBounds(12, 313, 57, 43);
		contentPane.add(lblShoes);
		
		JLabel lblAccessory = new JLabel("Accessory");
		lblAccessory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dao=new InvenDAO();
				v5=new Vector();
				v5.add("product");
				v5.add("name");
				v5.add("size");
				v5.add("company");
				v5.add("made");
				v5.add("date");
				v5.add("price");
				v5.add("amount");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(122, 53, 680, 387);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				Accessory();
			}
		});
		lblAccessory.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		lblAccessory.setBounds(12, 388, 98, 31);
		contentPane.add(lblAccessory);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 53, 680, 387);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		abcd();
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListSave frm=new ListSave(List.this);
				frm.setVisible(true);
				frm.setLocation(200, 200);
			}
		});
		lblAdd.setFont(new Font("Raavi", Font.BOLD, 19));
		lblAdd.setBounds(221, 454, 57, 25);
		contentPane.add(lblAdd);
		
		JLabel lblUpdate = new JLabel("Update");
		lblUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				System.out.println(idx);
				if(idx == -1) {
					JOptionPane.showMessageDialog(List.this, "편집할 자료를 선택하세요.");
					return; 
				}else {
					String name=String.valueOf(table.getValueAt(idx, 1));
					ListEdit frm=new ListEdit(List.this, name);
					frm.setVisible(true);
					frm.setLocation(550, 100);
				}
			
			
			}
		});
		lblUpdate.setFont(new Font("Raavi", Font.BOLD, 19));
		lblUpdate.setBounds(531, 450, 98, 33);
		contentPane.add(lblUpdate);
		
		

	}
	public void abcd() {
		DefaultTableModel model=new DefaultTableModel(dao.list(), v);
		table.setModel(model);
	}
	public void Outer() {
		DefaultTableModel model=new DefaultTableModel(dao.view(), v1);
		table.setModel(model);
	}
	public void Top() {
		DefaultTableModel model=new DefaultTableModel(dao.view2(), v2);
		table.setModel(model);
	}
	public void Bottom() {
		DefaultTableModel model=new DefaultTableModel(dao.view3(), v3);
		table.setModel(model);
	}
	public void Shoes() {
		DefaultTableModel model=new DefaultTableModel(dao.view4(), v4);
		table.setModel(model);
	}
	public void Accessory() {
		DefaultTableModel model=new DefaultTableModel(dao.view5(), v5);
		table.setModel(model);
	}
}
