package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		//new BufferedReader(new Reader 객체(System.in))형식을 가져야만 BufferedReader 사용가능
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("내용을 입력하세요:");
		try {
			String str=reader.readLine();//한 라인을 읽어들임
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
