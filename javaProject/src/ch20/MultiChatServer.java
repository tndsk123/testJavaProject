package ch20;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1:多 채팅ㄷ
//GUI관련 클래스
class ServerScreen extends JFrame{
	JTextArea ta;
	JTextField tf;
	public ServerScreen() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel label = new JLabel("앙 기모띠!");
		add(label, BorderLayout.NORTH);
		setVisible(true);
	}
}
public class MultiChatServer {
	HashMap usermap;
	
	public MultiChatServer() {
		usermap = new HashMap();
		Collections.synchronizedMap(usermap);
	}
	public static void main(String[] args) {
		new ServerScreen();//화면만 띄워줌
		new MultiChatServer().serviceStart();
	}
	public void serviceStart() {
		ServerSocket serverSocket =null;
		Socket socket =null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			while(true) {
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress()+"]"+"에서 접속하셨습니다.");
				ServerReceiver receiveThread = new ServerReceiver(socket);
				receiveThread.start();
				System.out.println("현재 실행중인 쓰레드 네임:"+receiveThread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end serviceStart()
	
	//현재 접속 중인 모든 사용자에게 메시지를 전송
	void sendToAll(String msg) {
		//메시지를 받아서 일괄 전송(HashMap에서 key값들의 집합을 리턴받음)
		Iterator it = usermap.keySet().iterator();
		while(it.hasNext()) {
			try {
				//메시지를 전송을 위한 출력스트림 생성
				DataOutputStream out = (DataOutputStream)usermap.get(it.next());
				out.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//end sentToAll
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				//데이터 통신을 위한 입출력 스트림 생성
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {
				System.out.println("ServerReceiver 소켓 IO 에러");
			}
		}//end ServerReceiver()
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF();//메시지 수신
				sendToAll("#"+name+"님이 들어 오셨습니다.");//메시지 보내기
				usermap.put(name, out);//Hash맵에 사용자 추가
				System.out.println("현재 접속자 수는 "+usermap.size()+"명 입니다.");
				while(in != null) {
					//받은 메시지를 모든 사용자에게 보냄
					sendToAll(in.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//대화방을 나간 사용자의 정보 출력
				sendToAll("#"+name+"님이 나가셨습니다.");
				usermap.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]에서 접속을 종료합니다.");
				System.out.println("현재 접속자 수는 "+usermap.size()+"명 입니다.");
			}
		}
	}
}
