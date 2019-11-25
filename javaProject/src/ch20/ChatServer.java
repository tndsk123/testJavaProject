package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket=null;
		try {
			//서비스를 위한 포트 개방
			serverSocket = new ServerSocket(5556);
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(-1);//비정상적 종료
		}
		//클라이언트용 소켓
		Socket clientSocket=null;
		try {
			clientSocket=serverSocket.accept();
			System.out.println("클라이언트의 ip:"+clientSocket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//발신용 스트림
		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
		//수신용 스트림
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String receive="";
		String send="앙 기모띠!";
		
		writer.println(send);
		Scanner sc=new Scanner(System.in);
		while(true) {
			receive = reader.readLine();
			if(receive ==null || receive.equals("exit"));
			System.out.println("[브론즈] "+receive);
			System.out.println("입력하세요(종료:exit)");
			send = sc.nextLine();
			writer.println(send);
			if(send.equals("exit")) break;
		}
		sc.close();
		writer.close();
		reader.close();
		clientSocket.close();
		serverSocket.close();
	}

}
