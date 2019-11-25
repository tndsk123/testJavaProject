package ch20;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketExam {
	public static void main(String[] args) {
		//서버소켓 : 서버에서 서비스를 위한 목적으로 만든 소켓(ip, port)
		ServerSocket socket=null;//서비스 제공을 위한 소켓(Server용)
		//Socket socket2=null;//서비스 아용을 위한 소켓(Client용)
		//포트번호 : 0~65535 내에서 배정이 가능하고 중복되지 않아야 함
		//1port당 1service만 가능
		//well known port number(자주 사용하는 포트 번호)
		//80(웹서비스), 21(FTP서비스), 445(파일공유), 3389(원격접속),.....
		for(int i=0; i<=65535; i++) {
			try {
				socket = new ServerSocket(i);//서버 소켓 생성
				socket.close();//소켓 서비스 종료
			} catch (Exception e) {//이미 사용중인 포트가 있으면 Exception처리 됨
			    System.out.println(i+"번 포트는 사용중입니다.");
			}
		}//end for
		System.out.println("포트 검사를 마쳤습니다.");
	}

}
