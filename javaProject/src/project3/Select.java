package project3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project2.Customer;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Select extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Select frame = new Select();
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
	public Select() {
		setTitle("Management System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitle = new JLabel("Manage System");
		lbltitle.setForeground(Color.RED);
		lbltitle.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 25 ));
		lbltitle.setBounds(113, 10, 295, 49);
		contentPane.add(lbltitle);
		
		JLabel lblNewLabel_1 = new JLabel("Customer");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				project3.Customer cus=new project3.Customer();
				cus.setVisible(true);
				cus.setLocation(400, 400);
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 37));
		lblNewLabel_1.setBounds(12, 50, 199, 192);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List list=new List();
				list.setVisible(true);
				list.setLocation(400,400);
			}
		});
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.YELLOW);
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 37));
		lblNewLabel_2.setBounds(245, 50, 177, 192);
		contentPane.add(lblNewLabel_2);
	}
}
