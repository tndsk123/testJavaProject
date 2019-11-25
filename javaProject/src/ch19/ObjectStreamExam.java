package ch19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
	//Stream : 데이터의 논리적인 통로, 바이트 단위
	//프로그램 ========> 외부자원 : 출력스트림
	//프로그램 <======== 외부자원 : 입력스트림
	
	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		MemberDTO m1 = new MemberDTO("kim", 30, "901231-1032812","1234");
		MemberDTO m2 = new MemberDTO("park", 28, "920128-1032713","2222");
		MemberDTO m3 = new MemberDTO("hong", 25, "950611-1234132","3333");
		
		try {
			//파일저장을 위한 출력 스트림
			fos=new FileOutputStream("d:\\object.dat");
			//메모리에 있는 객체를 파일로 저장하기 위한 스트림
			oos=new ObjectOutputStream(fos);
			oos.writeObject(m1);//m1객체를 파일에 저장
			oos.writeObject(m2);
			oos.writeObject(m3);
			System.out.println("객체를 파일로 저장했습니다.");
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
