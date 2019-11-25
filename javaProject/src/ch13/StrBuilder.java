package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String 불변(immutable)
		//StringBuilder 가변(mutable)
		
		//StringBuffer str1=new StringBuffer();//초기 버전용
		StringBuilder str1 = new StringBuilder();
		str1.append("java");//append는 문자열 내용 추가,메모리 절약
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");//0~3 인덱스 내용을 변경
		//참고로 replace()메소드는 주로 String객체의 replace()와 같은 역할을 하지만 더 많이 쓰인다.
		System.out.println(str1);
		
		String str2=str1.substring(4);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1.toString();//StringBuilder를 String으로 바꿀 때는 toString() 사용
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 : "+str3);
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) -> StringBuilder(str1)에 저장 : "+str1);
		
	}

}
