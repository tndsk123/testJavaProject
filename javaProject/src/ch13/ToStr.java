package ch13;
//Object는 모든 자료형을 담을 수 있음(다형성)
public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		obj=new Integer(20);
		//참조변수에는 원래 주소값이 들어가지만 jdk1.5버전부터는 value가 들어갈 수 있도록 내부처리(intValue() 등)호출하도록 했다.(Auto Boxing 처리)
		System.out.println(obj);//Auto Unboxing처리
		
		obj = new Double(20.5);
		System.out.println(obj);
		obj = "hello";
		//obj = new String("hello");
		System.out.println(obj);
	}

}
