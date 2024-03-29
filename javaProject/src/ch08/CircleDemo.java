package ch08;

class Circle{
	double radius;
	String color;
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	public Circle(double r) {
		radius = r;
		color = "파랑";
	}
	public Circle(String c) {
		radius = 10.0;
		color =c;
	}
		public Circle() {//기본생성자 명시적 코딩
		radius = 10.0;
		color = "빨강";
	}
	public void print() {
		System.out.println("반지름 : "+radius);
		System.out.println("색   깔 : "+color);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0,"빨강");
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
	}

}
