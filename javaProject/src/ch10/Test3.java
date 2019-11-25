package ch10;

public class Test3 {
	public static void main(String[] args) {
		double d=10;
		System.out.println(d);
		
		//다형성 기법
		Object a=new Integer(10);//부모클래스 변수=new WrapperClass(값)
		System.out.println(a);//원래는 번지값이 나와야 하지만
		//내부적으로 xxxValue()를 자동으로 실행하여 해당 값이 출력
		
		Integer i=new Integer(10);//해당타입 변수=new 해당타입();
		System.out.println(i);
	}
}
