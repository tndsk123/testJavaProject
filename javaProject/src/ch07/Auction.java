package ch07;

public class Auction {
	private String name, userid, grade;
	private int money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getGrade() {
		if(money >= 100000) {
			grade="gold";
		}else if(money >= 70000) {
			grade="silver";
		}else if(money >= 30000) {
			grade="bronze";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void print() {
		System.out.println("-----------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("-----------------------------");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}

}
