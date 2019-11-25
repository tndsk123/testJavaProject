package ch19;

import java.io.InputStreamReader;
import java.io.Reader;

//InputStream : 1byte 단위로 읽음
//InputStreamReader : 문자(2byte) 단위로 읽음

public class ReaderExam {
	
	public static void main(String[] args) {
		int var=0;
		Reader input=new InputStreamReader(System.in);
		System.out.println("내용을 입력하세요:");
		try {
			while(true) {
				var=input.read();//1문자(2byte)를 읽어들임
				if(var == 13) break;
				System.out.println(var+"==>"+(char)var);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
