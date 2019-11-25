package ch12;

public class TestMemberOuterEx {
	private int num;
	private String name;
	private String email;
	class TestInner{
		void a() {
			num = 1;
			name = "홍길동";
			email = "hong@gmail.com";
			System.out.println("---------------------------");
			System.out.println("고객번호 : "+num+"\n"+"이름 : "+name+"\n"+"이메일 : "+email);
			System.out.println("---------------------------");
		}
	}
	
	public static void main(String[] args) {
		TestMemberOuterEx test = new TestMemberOuterEx();
		TestMemberOuterEx.TestInner t = test.new TestInner();
		t.a();
	}
			

}
