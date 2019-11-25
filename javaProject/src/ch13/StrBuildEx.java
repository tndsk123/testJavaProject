package ch13;

public class StrBuildEx {
	
	public static void main(String[] args) {
		System.out.println("-------------------------------------------------");
		StringBuilder str1 = new StringBuilder("I am a ");
		StringBuilder str2 = str1.append("Java Programmer");
		System.out.println("append()메소드를 활용 : "+str2);
		
		str2.replace(7, 11, "JSP");
		System.out.println("replace()를 활용 : "+str2);
		
		String str3=str2.substring(7);
		System.out.println("substring()을 활용 : "+str3);
		System.out.println("-------------------------------------------------");
		
	}

}
