package project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ch22_oracle_jdbc.ScoreDAO;
import ch22_oracle_jdbc.ScoreDTO;
import ch22_oracle_jdbc.ScoreEdit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListEdit extends JFrame {

	private JPanel JPanel_1;
	private JTextField tfProduct;
	private JTextField tfName;
	private JTextField tfSize;
	private JTextField tfCompany;
	private JTextField tfMade;
	private JTextField tfDate;
	private JTextField tfPrice;
	private JTextField tfAmount;
	private List parent;
	private InvenDAO dao;
	private InvenDTO dto;
	private String name;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ListEdit frame = new ListEdit();
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
	public ListEdit(List parent, String name) {
		setTitle("Product Edit");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 257, 512);
		JPanel_1 = new JPanel();
		JPanel_1.setBackground(Color.WHITE);
		JPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JPanel_1);
		JPanel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update product");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(42, 0, 157, 37);
		JPanel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 60, 57, 15);
		JPanel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(12, 106, 57, 15);
		JPanel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Size");
		lblNewLabel_3.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 150, 57, 15);
		JPanel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Company");
		lblNewLabel_4.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(12, 200, 69, 15);
		JPanel_1.add(lblNewLabel_4);
	
		JLabel lblNewLabel_5 = new JLabel("Made");
		lblNewLabel_5.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(12, 252, 57, 15);
		JPanel_1.add(lblNewLabel_5);
	
		JLabel lblNewLabel_6 = new JLabel("Price");
		lblNewLabel_6.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(12, 360, 57, 15);
		JPanel_1.add(lblNewLabel_6);
	
		JLabel lblNewLabel_8 = new JLabel("Date");
		lblNewLabel_8.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(12, 302, 57, 15);
		JPanel_1.add(lblNewLabel_8);
	
		JLabel lblNewLabel_7 = new JLabel("Amount");
		lblNewLabel_7.setFont(new Font("Raavi", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(12, 409, 57, 15);
		JPanel_1.add(lblNewLabel_7);
		
		tfProduct = new JTextField();
		tfProduct.setBounds(113, 55, 116, 21);
		JPanel_1.add(tfProduct);
		tfProduct.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(113, 101, 116, 21);
		JPanel_1.add(tfName);
		tfName.setColumns(10);
		
		tfSize = new JTextField();
		tfSize.setBounds(113, 150, 116, 21);
		JPanel_1.add(tfSize);
		tfSize.setColumns(10);
		
		tfCompany = new JTextField();
		tfCompany.setBounds(113, 195, 116, 21);
		JPanel_1.add(tfCompany);
		tfCompany.setColumns(10);
		
		tfMade = new JTextField();
		tfMade.setBounds(113, 247, 116, 21);
		JPanel_1.add(tfMade);
		tfMade.setColumns(10);
		
		tfDate = new JTextField();
		tfDate.setBounds(113, 297, 116, 21);
		JPanel_1.add(tfDate);
		tfDate.setColumns(10);
		
		tfPrice = new JTextField();
		tfPrice.setBounds(113, 355, 116, 21);
		JPanel_1.add(tfPrice);
		tfPrice.setColumns(10);
		
		tfAmount = new JTextField();
		tfAmount.setBounds(113, 404, 116, 21);
		JPanel_1.add(tfAmount);
		tfAmount.setColumns(10);
		
		dao=new InvenDAO();
		dto=dao.A(name);
		tfProduct.setText(dto.getProduct());
		tfName.setText(dto.getName());
		tfSize.setText(dto.getSize());		
		tfCompany.setText(dto.getCompany());
		tfMade.setText(dto.getMade());
		tfDate.setText(dto.getDate());
		tfPrice.setText(dto.getPrice()+"");
		tfAmount.setText(dto.getAmount()+"");
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
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
			    int result= dao.update(dto);
			    if(result==1) {
			    	JOptionPane.showMessageDialog(ListEdit.this, "수정되었습니다.");
			    	parent.abcd();
			    	parent.Outer();
			    	parent.Top();
			    	parent.Bottom();
			    	parent.Shoes();
			    	parent.Accessory();
			    	dispose();
			    }
			}
		});
		btnUpdate.setFont(new Font("Raavi", Font.PLAIN, 15));
		btnUpdate.setBounds(12, 441, 97, 23);
		JPanel_1.add(btnUpdate);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfName.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(ListEdit.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					result=dao.delete(name);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(ListEdit.this, "삭제되었습니다.");
					parent.abcd();
					parent.Outer();
					parent.Top();
			    	parent.Bottom();
			    	parent.Shoes();
			    	parent.Accessory();
					dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("Raavi", Font.PLAIN, 15));
		btnNewButton.setBounds(132, 439, 97, 23);
		JPanel_1.add(btnNewButton);

	}
}
