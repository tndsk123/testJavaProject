package ch09;

public class Scholar extends Student{
	private String category;//장학금의 종류
	private int money;//장학금액
	
	public void input(String name, String num, String major, int year, String category, int money) {
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}
	
	public void print() {
		System.out.println("이름\t학번\t\t전공\t학년\t구분\t장학금액");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+category+"\t"+money+"\n");
	}
	
	public void print2() {
		System.out.println("이름\t학번\t\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}

}
