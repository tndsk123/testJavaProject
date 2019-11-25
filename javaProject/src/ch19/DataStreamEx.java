package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//텍스트 파일이 아닌 binary File(이진파일)로 저장
public class DataStreamEx {
	public static void main(String[] args) throws IOException {
		//윈도우즈 : \
		//리눅스 : /, 드라이브가 없고 디렉토리만 있다.
		
		try {//저장
			DataOutputStream dataout=new DataOutputStream(new FileOutputStream("d:\\test1.dat"));
			dataout.writeInt(123);//숫자 형식의 자료를 파일 저장
			dataout.writeChar('A');//문자 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수 형식의 자료를 파일에 저장
			dataout.close();
			System.out.println("저장되었습니다.");
			//읽기
			DataInputStream datain = new DataInputStream(new FileInputStream("d:\\test1.dat"));
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
