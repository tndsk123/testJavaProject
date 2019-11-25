package ch14;

public class Student2 {
	private String name, sub;
	private int num, score;
	public Student2() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student2(int num, String name, String sub, int score) {
		super();
		this.name = name;
		this.sub = sub;
		this.num = num;
		this.score = score;
	}
	

}
