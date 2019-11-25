package ch19;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		//String : 불변성, 값이 변할일이 없을 때 사용
		//StringBuilder : 가변성, 값이 변할 일들이 많을 때
		//ex)append, 문자열+문자열...
		StringBuilder output = new StringBuilder();
		String str = null;
		try {
			RandomAccessFile file=new RandomAccessFile("d:\\test.txt", "rw");
			//파일포인터(파일을 어디까지 읽었는지 가리킴)
			//파일 포인터를 이동시킴
			file.seek(89);//89번째 인덱스 부터
			file.write("추가한 내용".getBytes());//기존 내용을 덮어쓰게 된다.
			file.seek(0);//0번째 인덱스로 이동
			while(file.getFilePointer() < file.length()) {
				output.append(file.getFilePointer()+":");
				str=file.readLine();
				//한글처리
				//스트링.getBytes() 스트링을 바이트 배열로 변환
				//new String(문자열,캐릭터셋)
				//iso-8859-1,88598_1 서유럽언어 인코딩 방식
				//ms949 2바이트
				//utf-8 3바이트 : ex)초성:1byte - 중성:1byte - 종성:1byte
				str = new String(str.getBytes("8859_1"),"utf-8");
				output.append(str+"\r\n");
			}
			file.close();
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
