package ch19;

//스트림:데이터의 논리적인 통로
//1byte 단위로 처리됨
//InputStream(입력스트림)
//OutputStream(출력스트림)
public class InputStreamExam {
	//프로그램 <= 키보드
	public static void main(String[] args) {
		int var=0;//입력 받는 값을 숫자로 받아 처리
		
		try {//네트워크나 입출력, DB는 필수적으로 예외처리(try,catch)
			System.out.println("내용을 입력하세요:");
			
			var = System.in.read();//키보드로부터 1byte씩 읽음.
			//따라서 한글(2byte)은 처리가 안됨 => InputStreamReader를 써야함
			while(var != 13) {//엔터키를 입력할때까지 반복
				System.out.println(var+"==>"+(char)var);//모든문자에는 고유한 숫자코드가 있다.int형 var를 문자형(char)로 형변환해서 출력
				var = System.in.read();
			}
		} catch (Exception e) {//입출력 관련 예외처리
			e.printStackTrace();//개발자 코드
		}
	}

}
