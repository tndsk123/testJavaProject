package ch10;

class Pa{
	private String name="홍길동";
	public void print() {
		System.out.println("이름 : "+name);
	}
}

class Ch extends Pa{
	private int age=30;
	@Override
	public void print() {
		super.print();
		System.out.println("나이 : "+age);
	}
}

public class PolyUse {
	public static void main(String[] args) {
		String tel = "010-1234-5678";
		Pa c = new Ch();//다형성: 좌(부) = 우(자)
		c.print();
		System.out.println("전화번호 : "+tel);
	}
}
