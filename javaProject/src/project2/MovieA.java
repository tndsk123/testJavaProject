package project2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ch17.MyColorAction;
import project.ProjectList;
import project.ProjectSave;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MovieA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieA frame = new MovieA();
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
	public MovieA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setToolTipText("");
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JButton btnCustomer = new JButton("고객용");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCustomer.setFont(new Font("굴림", Font.PLAIN, 18));
		splitPane.setRightComponent(btnCustomer);
		
		
		JButton btnManager = new JButton("관리자용");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager frm=new Manager();
				frm.setVisible(true);
				frm.setLocation(400,400);
			}
		});
		btnManager.setFont(new Font("굴림", Font.PLAIN, 18));
		splitPane.setLeftComponent(btnManager);
	}

}
