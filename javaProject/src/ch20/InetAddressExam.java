package ch20;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			//localhost => loop back주소(127.0.0.1) 
			InetAddress address = InetAddress.getByName("localhost");
			System.out.println(address);//호스트이름, ip주소
			System.out.println(address.getHostName());//호스트이름(도메인이름)
			System.out.println(address.getHostAddress());//ip주소
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
