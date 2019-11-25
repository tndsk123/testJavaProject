package ch10;

class Triangle extends Figure {
	@Override//주석처럼 쓰이는 어노테이션
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}

class Rectangle extends Figure {
	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure{
	@Override
	void draw(){
		System.out.println("원 그리기...");
	}
}

public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	public static void main(String[] args) {
		//좌,우변 같은 타입(정상)
		Triangle t = new Triangle();
		t.draw();
		Rectangle r= new Rectangle();
		r.draw();
		Circle c= new Circle();
		c.draw();
		
		//좌변의 자료형과 우변의 자료형이 틀린데, Figure하나로
		//모두다 처리 가능(다형성)
		Figure f=new Triangle();//좌변:부모클래스, 우변:자식클래스
		f.draw();
		f=new Rectangle();
		f.draw();
		f=new Circle();
		f.draw();
		
	}

}
