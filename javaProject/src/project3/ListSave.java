package project3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project2.Manager2;
import project2.ManagerSave;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfProduct;
	private JTextField tfName;
	private JTextField tfSize;
	private JTextField tfCompany;
	private JTextField tfMade;
	private JTextField tfPrice;
	private JTextField tfAmount;
	private JTextField tfDate;
	private List frm;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ListSave frame = new ListSave();
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
	public ListSave(List frm) {
		this();
		this.frm=frm;
	}
	public ListSave() {
		setTitle("Product Add");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 257, 512);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add product");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 0, 132, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 60, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfProduct = new JTextField();
		tfProduct.setBounds(101, 55, 116, 21);
		contentPane.add(tfProduct);
		tfProduct.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(12, 106, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfName = new JTextField();
		tfName.setBounds(101, 101, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Size");
		lblNewLabel_3.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 150, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfSize = new JTextField();
		tfSize.setBounds(101, 145, 116, 21);
		contentPane.add(tfSize);
		tfSize.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Company");
		lblNewLabel_4.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(12, 200, 69, 15);
		contentPane.add(lblNewLabel_4);
		
		tfCompany = new JTextField();
		tfCompany.setBounds(101, 195, 116, 21);
		contentPane.add(tfCompany);
		tfCompany.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Made");
		lblNewLabel_5.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(12, 252, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		tfMade = new JTextField();
		tfMade.setBounds(101, 247, 116, 21);
		contentPane.add(tfMade);
		tfMade.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Price");
		lblNewLabel_6.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(12, 360, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		tfPrice = new JTextField();
		tfPrice.setBounds(101, 355, 116, 21);
		contentPane.add(tfPrice);
		tfPrice.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Date");
		lblNewLabel_8.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(12, 302, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		tfDate = new JTextField();
		tfDate.setBounds(101, 299, 116, 21);
		contentPane.add(tfDate);
		tfDate.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Amount");
		lblNewLabel_7.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(12, 409, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		tfAmount = new JTextField();
		tfAmount.setBounds(101, 404, 116, 21);
		contentPane.add(tfAmount);
		tfAmount.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Raavi", Font.PLAIN, 15));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String product=tfProduct.getText();
				String name=tfName.getText();
				String size=tfSize.getText();
				String company=tfCompany.getText();
				String made=tfMade.getText();
				String date=tfDate.getText();
				int price=Integer.parseInt(tfPrice.getText());
				int amount=Integer.parseInt(tfAmount.getText());
			    InvenDTO dto=new InvenDTO(product, name, size, company, made, date, price, amount);
			    InvenDAO dao=new InvenDAO();
			    int result=dao.insert(dto);
			    if(result==1) {
					JOptionPane.showMessageDialog(ListSave.this, "저장되었습니다.");
					frm.abcd();
					frm.Outer();
					frm.Top();
					frm.Bottom();
					frm.Shoes();
					frm.Accessory();
					dispose();
			    }
			}
		});
		btnSave.setBounds(70, 441, 97, 23);
		contentPane.add(btnSave);
		
		
	}
}
