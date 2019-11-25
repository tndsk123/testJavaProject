package ch10;

class K{//부모클래스
	int a=10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K {//자식클래스
	int a=20;
	@Override
	public void print() {//오버라이딩(재정의) 메소드
		System.out.println(a);
	}
}


public class Poly {
	public static void main(String[] args) {
		V a=new V();//일반적 형식
		a.print();
		K b=new K();
		b.print();
		
		K c=new V();//좌:부모, 우:자식 => (다형성)
		//V c=new K();//좌:자식, 우:부모 (X)
		c.print();
		//다형성을 쓸 때 실제 참조변수가 가르치는 객체가 사용하고자
		//하는 객체가 맞는지를 검사할 때 instanceof연산자를 사용.
		System.out.println("c instanceof V? :"+(c instanceof V));
	}
}
