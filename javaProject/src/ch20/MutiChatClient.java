package ch20;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MutiChatClient {
	static String nickName = null;
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	public static void main(String[] args) {
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요.");
		new ClientScreen(nickName);
		
		Socket socket;
		try {
			String serverip = "192.168.0.36";
			socket = new Socket(serverip,7777);
			System.out.println("서버에 연결되었습니다.");
			Thread receiveTread = new ClientReceiver(socket);
			receiveTread.start();
			Thread sender = new ClientSender(socket,nickName);
			sender.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end main()
	//메시지 전송용 스레드 클래스
	static class ClientSender extends Thread{
		Socket socket;
		String name;
		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end ClientSender(0
		@Override
		public void run() {
			Scanner scan = new Scanner(System.in);
			try {
				if(out != null) {
					out.writeUTF(name);//대화명 보내기
				}
				while(out != null) {
					out.writeUTF("["+name+"]"+scan.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end run
	}//Client Sender
	//메시지 수신용 스레드 클래스
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		ClientReceiver(Socket socket) {
			this.socket=socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			while(in != null) {
				try {
					String s = in.readUTF();
					System.out.println(s);
					ta.append(s + "\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}//end run()
	}//ClientReceiver
	//화면 구성용 클래스
	static class ClientScreen extends JFrame implements ActionListener{
		public ClientScreen(String nick) {
			setSize(300,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle(nick+"의 채팅방 클라이언트!");
			setLayout(new BorderLayout());
			ta = new JTextArea(25, 40);
			tf = new JTextField(25);
			tf.addActionListener(this);
			JPanel panel = new JPanel();
			
			//패널의 레이아웃 변경(FlowLayout => BorderLayout)
			panel.setLayout(new BorderLayout());
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);//패널의 배치방향 설정
			JLabel label_name = new JLabel(nick+"님");
			panel.add(label_name, BorderLayout.WEST);
			panel.add(tf,BorderLayout.CENTER);
			
			//JTextArea 처리
			JScrollPane jspanel = new JScrollPane();
			panel.add(jspanel, BorderLayout.NORTH);
			jspanel.setViewportView(ta);
			add(panel, BorderLayout.SOUTH);
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tf) {//텍스트필드에서 엔터키 입력
				try {
					//텍스트필드에서 입력한 문자열을 보냄
					out.writeUTF("["+nickName+"]"+tf.getText());
					tf.setText("");//화면지우기
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}
		
	}

}
