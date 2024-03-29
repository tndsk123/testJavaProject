package ch08;

public class Calculator {
	//멤버변수
	private int left;
	private int right;
	//생성자를 만들 때 기본생성자를 함께 만드는 습관을 들인다.
	//하나라도 User definte한 생성자가 만들어지면 더이상 컴파일러는 기본생성자를 자동으로 안만든
	
	public Calculator() {
		System.out.println("기본 생성자 호출...");
	}
	public Calculator(int left, int right) {
		System.out.println("매개 변수가 있는 생성자 호출...");
		this.left=left;
		this.right=right;
	}
	//getter,setter 추가
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}

}
