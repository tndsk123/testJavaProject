package ch13;

public class Exam {

	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		System.out.println(a==b); //주소값이 같냐? true
		System.out.println(a.equals(b)); //내용이 같냐?
		
		System.out.println("=================");
		String c=new String("hello");//새로운 주소값을 가진다. ex)100번지
		String d=new String("hello");//새로운 주소값을 가진다. ex)200번지
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
	}

}