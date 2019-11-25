package ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		Socket socket=null;
		PrintWriter writer=null;
		BufferedReader reader=null;
		try {
			socket=new Socket("192.168.0.124",5556);
			writer=new PrintWriter(socket.getOutputStream(),true);
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String recieve="";
		String send;
		Scanner sc= new Scanner(System.in);
		while(true) {
			recieve=reader.readLine();
			System.out.println("[다이아] "+recieve);
			if(recieve.equals("exit")) break;
			System.out.println("입력하세요(종료:exit)");
			send=sc.nextLine();//보낼문자(키보드 입력)
			if(send.equals("exit")) {
				System.out.println("종료되었습니다.");
				break;
			}
			if(send != null) {
				writer.println(send);
			}
		}
		sc.close();
		writer.close();
		reader.close();
		socket.close();
	}

}
