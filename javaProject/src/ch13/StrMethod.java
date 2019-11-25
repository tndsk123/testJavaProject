package ch13;

public class StrMethod {
	
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming";//str1 = str1+" programming"
		
		System.out.println(str1.length());
		String str2 = str1.concat(" programming");//concat()으로 문자열 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//n번째 문자
		System.out.println(str2.indexOf("program"));//"program"의 시작
		//문자열인 p 문자의 위치(인덱스값)을 리턴
		System.out.println(str2.indexOf("z"));//해당 내용이 없으면 -1을 리턴
		System.out.println(str2.substring(0, 4));//substring(start,end(n+1))
		System.out.println(str2.substring(5));//5~끝까지
		
		System.out.println(str2.replace("java", "jsp"));//문자열변경 replace(A,B) = A를 B로 변경
		System.out.println(str2);
		str2 = str2.replace("java","jsp");
		System.out.println(str2);
	}

}
