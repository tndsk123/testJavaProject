package ch09;

public class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	public Ball() {
	
	}
	public void findColor() {
		System.out.println(color+" 공이다.");
	}
	public void findVolum() {
		System.out.println("부피는 4/3*(파이*반지름*반지름*반지름)이다.");
	}

}
