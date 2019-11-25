package ch22_oracle_jdbc;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpList extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfDate;
	private JTextField tfSal;
	private JTextField tfSearch;
	private JTable table;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnSearch;
	
	private EmpDAO dao;
	private EmpDTO dto;
	private Vector<String> col;
	private DefaultTableModel model;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpList frame = new EmpList();
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
	public EmpList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 245, 460, 247);
		contentPane.add(scrollPane);
		
		dao = new EmpDAO();
		col = new Vector<String>();
		col.add("사원번호");
		col.add("사원명");
		col.add("입사일");
		col.add("급여");
		list();
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx = table.getSelectedRow();
				tfNum.setEditable(false);
				tfNum.setText(table.getValueAt(idx, 0)+"");
				tfName.setText(table.getValueAt(idx, 1)+"");
				tfDate.setText(table.getValueAt(idx, 2)+"");
				tfSal.setText(table.getValueAt(idx, 3)+"");
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("사원번호");
		lblNewLabel.setBounds(12, 30, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfNum = new JTextField();
		tfNum.setBounds(81, 27, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("사원명");
		lblNewLabel_1.setBounds(12, 61, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setBounds(81, 58, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("입사일");
		lblNewLabel_2.setBounds(12, 92, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfDate = new JTextField();
		tfDate.setBounds(81, 89, 116, 21);
		contentPane.add(tfDate);
		tfDate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("급여");
		lblNewLabel_3.setBounds(12, 123, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfSal = new JTextField();
		tfSal.setBounds(81, 120, 116, 21);
		contentPane.add(tfSal);
		tfSal.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("사원명을 입력하세요");
		lblNewLabel_4.setBounds(12, 179, 144, 15);
		contentPane.add(lblNewLabel_4);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(188, 176, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.insert(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(EmpList.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
				
			}
		});
		btnSave.setBounds(330, 26, 97, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ename=tfName.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(EmpList.this, "삭제하시겠습니Rk?");
				if(response==JOptionPane.YES_OPTION) {
					result = dao.delete(ename);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(EmpList.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(330, 57, 97, 23);
		contentPane.add(btnDelete);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.update(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(EmpList.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(330, 88, 97, 23);
		contentPane.add(btnUpdate);
		
		btnSearch = new JButton("찾기");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnSearch.setBounds(330, 175, 97, 23);
		contentPane.add(btnSearch);
	}
	
	public void search() {
		String ename = tfSearch.getText();
		model = new DefaultTableModel(dao.search(ename),col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}
	
	public void input() {
		int empno = Integer.parseInt(tfNum.getText());
		String ename = tfName.getText();
		String hiredate = tfDate.getText();
		int sal = Integer.parseInt(tfSal.getText());
		dto = new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
	}
	
	public void clear() {
		tfNum.setText("");
		tfName.setText("");
		tfDate.setText("");
		tfSal.setText("");
		tfNum.requestFocus();
		tfNum.setEditable(true);
	}
	
	public void list() {
		model = new DefaultTableModel(dao.list(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
}
