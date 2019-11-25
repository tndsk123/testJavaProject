package project4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import project2.MovieDAO;

import javax.swing.JScrollPane;

public class WeatherList extends JFrame {

	private JPanel contentPane;
	private ImageIcon icon;
	
	private JTextField tfWeather;
	private WeatherDAO dao;
	private WeatherDTO dto;
	private Vector col;
	private String name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeatherList frame = new WeatherList();
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
	public WeatherList() {	
		setTitle("Weather Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 538);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				icon= new ImageIcon("C:\\배경.jpg");
				g.drawImage(icon.getImage(), 0, 0, null);
		        setOpaque(false);
		        super.paintComponent(g);
		
			}
		};
		panel.setBounds(0, 0, 1000, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Today Weather");
		lblNewLabel.setBounds(12, 10, 325, 82);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 37));
		panel.add(lblNewLabel);
		
		tfWeather = new JTextField();
		tfWeather.setBounds(626, 30, 205, 52);
		tfWeather.setFont(new Font("돋움", Font.PLAIN, 25));
		panel.add(tfWeather);
		tfWeather.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MR02-28\\Desktop\\온도계.jpg"));
		lblNewLabel_1.setBounds(12, 163, 230, 230);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MR02-28\\Desktop\\적당히 밝음.jpg"));
		lblNewLabel_2.setBackground(SystemColor.activeCaption);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(254, 163, 230, 230);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MR02-28\\Desktop\\강수량.jpeg"));
		lblNewLabel_3.setBounds(496, 163, 230, 230);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\MR02-28\\Desktop\\비올확률입니다.jpg"));
		lblNewLabel_7.setBounds(738, 163, 230, 230);
		panel.add(lblNewLabel_7);
		
		JLabel lblName = new JLabel("우리동네의 날씨는 ???");
		lblName.setFont(new Font("DX빨간우체통B", Font.BOLD, 25));
		lblName.setBounds(335, 102, 279, 51);
		panel.add(lblName);
		
		JLabel lblNewLabel_10 = new JLabel("지역을 입력하세요 ->");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("DX빨간우체통B", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(412, 42, 202, 32);
		panel.add(lblNewLabel_10);
		
		JLabel lbltem = new JLabel("오늘의 기온은?");
		lbltem.setFont(new Font("DX빨간우체통B", Font.PLAIN, 20));
		lbltem.setBounds(12, 417, 230, 52);
		panel.add(lbltem);
		
		JLabel lblcon = new JLabel("오늘의 날씨는?");
		lblcon.setFont(new Font("DX빨간우체통B", Font.PLAIN, 20));
		lblcon.setBounds(254, 417, 230, 52);
		panel.add(lblcon);
		
		JLabel lblhum = new JLabel("오늘의 습도는?");
		lblhum.setFont(new Font("DX빨간우체통B", Font.PLAIN, 20));
		lblhum.setBounds(496, 417, 230, 52);
		panel.add(lblhum);
		
		JLabel lblpro = new JLabel("오늘의 비올 확률은?");
		lblpro.setFont(new Font("DX빨간우체통B", Font.PLAIN, 20));
		lblpro.setBounds(738, 417, 230, 52);
		panel.add(lblpro);
		
		
		JButton btnResearch = new JButton("Research");
		btnResearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tfWeather.getText();
				dao=new WeatherDAO();
				dto=new WeatherDTO();
				dto=dao.view(name);
				lblName.setText(name+"의 날씨는");
				lbltem.setText("기온 : "+dto.getTem());
				lblcon.setText("날씨 : "+dto.getCon());
				lblhum.setText("습도 : "+dto.getHum());
				lblpro.setText("비올확률 : "+dto.getPro());
				
			}
		});
		btnResearch.setBounds(843, 29, 145, 52);
		btnResearch.setFont(new Font("Segoe UI", Font.BOLD, 25));
		panel.add(btnResearch);
		
		
	}
}
