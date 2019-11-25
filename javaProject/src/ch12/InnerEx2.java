package ch12;

class OuterEx{
	class First{
		protected int cos = 2;
		
	}
	static class Second{
		String name = "김길동";
	}
	void Thrid() {
		class Third{
			String email = "kim@gmail.com";
		}
		Third e = new Third();
		System.out.println("이메일 : "+e.email);
	}
}

public class InnerEx2 {
	public static void main(String[] args) {
		System.out.println("----------------------");
		OuterEx oc = new OuterEx();
		OuterEx.First a = oc.new First();
		System.out.println("고객번호 : "+a.cos);
		
		OuterEx.Second b = new OuterEx.Second();
		System.out.println("이름 : "+b.name);
		
		oc.Thrid();
		System.out.println("----------------------");
	}

}
