package ch19;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWriter2 {
	public static void main(String[] args) {
		OutputStream a = null;
		try {
			a=new FileOutputStream("d:\\test2.txt");
			System.out.println("입력하세요:");
			while(true) {
				int i=System.in.read();
				if(i==13) break;
				a.write(i);
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
