package ch21_jdbc;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MotorGo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfNum;
	private JTextField tfCom;
	private JTextField tfYear;
	private JTextField tfEff;
	private JTextField tfSearch;
	private JButton btnSave;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnSearch;
	
	private MotorDAO3 dao;
	private Vector<String> col;
	private DefaultTableModel model;
	private MotorDTO dto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MotorGo frame = new MotorGo();
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
	public MotorGo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 252, 461, 242);
		contentPane.add(scrollPane);
		
		dao=new MotorDAO3();
		col=new Vector<String>();
		col.add("차 번호");
		col.add("제조사");
		col.add("연식");
		col.add("연비");
		list();
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				tfNum.setEditable(false);
				tfNum.setText(table.getValueAt(idx, 0)+"");
				tfCom.setText(table.getValueAt(idx, 1)+"");
				tfYear.setText(table.getValueAt(idx, 2)+"");
				tfEff.setText(table.getValueAt(idx, 3)+"");
				
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("차 번호");
		lblNewLabel.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfNum = new JTextField();
		tfNum.setBounds(106, 7, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("제조사");
		lblNewLabel_1.setBounds(12, 45, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfCom = new JTextField();
		tfCom.setBounds(106, 42, 116, 21);
		contentPane.add(tfCom);
		tfCom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("연식");
		lblNewLabel_2.setBounds(12, 83, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfYear = new JTextField();
		tfYear.setBounds(106, 80, 116, 21);
		contentPane.add(tfYear);
		tfYear.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("연비");
		lblNewLabel_3.setBounds(12, 123, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfEff = new JTextField();
		tfEff.setBounds(106, 120, 116, 21);
		contentPane.add(tfEff);
		tfEff.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("차 번호를 입력하세요");
		lblNewLabel_4.setBounds(12, 179, 123, 29);
		contentPane.add(lblNewLabel_4);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(161, 183, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result=dao.insert(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(MotorGo.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnSave.setBounds(282, 21, 97, 23);
		contentPane.add(btnSave);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result=dao.update(dto);
				if(result==1){
					JOptionPane.showMessageDialog(MotorGo.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(282, 62, 97, 23);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String li_number=tfNum.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(MotorGo.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					result=dao.delete(li_number);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(MotorGo.this, "삭제되었습니다.");
					list();//테이블 갱신
					table.setModel(model);
					clear();//텍스트필드 초기화
				}
			}
		});
		btnDelete.setBounds(282, 103, 97, 23);
		contentPane.add(btnDelete);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnSearch.setBounds(305, 182, 97, 23);
		contentPane.add(btnSearch);
	}
	public void search() {
		String li_number=tfSearch.getText();
		model=new DefaultTableModel(dao.search(li_number),col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);

	}
	
	public void input() {
		String li_number=tfNum.getText();
		String company=tfCom.getText();
		int year=Integer.parseInt(tfYear.getText());
		int eff=Integer.parseInt(tfEff.getText());
		dto=new MotorDTO(li_number, company, year, eff);
	}
	
	public void clear() {
		tfNum.setText("");
		tfCom.setText("");
		tfYear.setText("");
		tfEff.setText("");
		tfNum.requestFocus();
		tfNum.setEditable(true);
	}
	
	public void list() {
		model=new DefaultTableModel(dao.list(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
}
