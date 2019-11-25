package ch06;
//Overload
//자료형 ... 변수 => 가변사이즈 매개변수처리, 변수가 배열참조변수가 됨
//같은 자료형의 매개변수의 갯수에 관계없이 처리
//매개변수들이 배열로 저장됨
//실제로는 많이 안씀
public class VarianParam {

	static void print(String ...n) {//n이 가변형 매개변수(배열처리의 주소 값)가 됨
		for(int i=0; i<n.length; i++)
		System.out.println(n[i]);
	}
//	static void print(String a) {
//		System.out.println(a);
//	}
//	
//	static void print(String a, String b) {
//		System.out.print(a+" ");
//		System.out.println(b);
//	}
//	
//	static void print(String a, String b, String c) {
//		System.out.print(a+ " ");
//		System.out.print(b+ " ");
//		System.out.println(c);
//	}
	
	
	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","jsp");
	}

}
