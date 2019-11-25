package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.util.Vector;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customer2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private MovieDAO dao;
	private SeatDAO dao2;
	private Vector col;
	private Vector col2;
	private Vector col3;
	private String movie;
	private Reserve re;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer2 frame = new Customer2();
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
	public Customer2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 66, 632, 249);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnBooked = new JButton("예약");
		btnBooked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBooked.setBounds(536, 20, 97, 23);
		contentPane.add(btnBooked);
		
		JButton btnMovie = new JButton("영화목록");
		btnMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao=new MovieDAO();
				col=new Vector();
				col.add("영화명");
				col.add("장르");
				col.add("별점");
				col.add("개봉일");
				col.add("감독");
				col.add("총관객");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 66, 632, 249);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				Movie();
				
				JButton btnSelect = new JButton("선택");
				btnSelect.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int idx=table.getSelectedRow();
						System.out.println(idx);
						if(idx==-1) {
							JOptionPane.showMessageDialog(Customer2.this, "편집할 자료를 선택하세요.");
							return;
						}else {
							String movie=String.valueOf(table.getValueAt(idx, 0));
						}
					}
				});
				btnSelect.setBounds(265, 326, 97, 23);
				contentPane.add(btnSelect);
				
			}
		});
		btnMovie.setBounds(28, 20, 97, 23);
		contentPane.add(btnMovie);
		
		JButton btnRoom = new JButton("상영관");
		btnRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao2=new SeatDAO();
				col2=new Vector();
				col2.add("상영관");
				col2.add("날자");	
				col2.add("상영 시간");
				col2.add("구분");
				col2.add("금액");
							
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 66, 632, 249);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				Seat();
			}
		});
		btnRoom.setBounds(194, 20, 97, 23);
		contentPane.add(btnRoom);
		
		JButton btnSeat = new JButton("좌석");
		btnSeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				re=new Reserve();
				col3=new Vector();
				col3.add("A1");
				col3.add("A2");
				col3.add("A3");
				col3.add("A4");
				col3.add("A5");
				col3.add("A6");
				col3.add("A7");
				col3.add("A8");
				col3.add("A9");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 66, 632, 249);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				
			}
		});
		btnSeat.setBounds(361, 20, 97, 23);
		contentPane.add(btnSeat);
	}
	
	public void Movie() {
		DefaultTableModel model=new DefaultTableModel(dao.list(), col);
		table.setModel(model);
	}
	
	public void Seat() {
		DefaultTableModel model=new DefaultTableModel(dao2.list(), col2);
		table.setModel(model);
	}
	public void Reserve() {
		DefaultTableModel model=new DefaultTableModel(re.reserve(), col2);
		table.setModel(model);
	}
}
