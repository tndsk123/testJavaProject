package ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트용
public class DataClient {
	public static void main(String[] args) throws Exception {
		Socket s=new Socket("192.168.0.124",8000);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받음
		String res = input.readLine();
		System.out.println(res);
		s.close();//소켓닫기(연결종료)
		System.exit(0);
	}

}
