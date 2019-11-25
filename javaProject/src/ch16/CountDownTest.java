package ch16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
//JFrame은 GUI 프로그램의 API일종
public class CountDownTest extends JFrame{
	private JLabel label;
	class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=10; i>=0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}//end for
		}//end run()
	}//end class MyThread
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Start");
		label.setFont(new Font("Serif",Font.BOLD,100));
		add(label);
		(new MyThread()).start();
		setVisible(true);
	}//end CountDownTest()
	
	public static void main(String[] args) {
		CountDownTest t = new CountDownTest();
	}

}
