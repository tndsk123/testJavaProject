package ch05;

public class StringArray2 {
	
	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","Android"};
//		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i]);
//		}
		//향상된 for문(jdk1.5 ver 이상 = for(개별값 저장 변수 : 집합 변수)
		//집합변수의 모든 값을 반복처리
		for(String si : str) {
			System.out.println(si);
		}
	}

}
