package ch07;

public class Student {
	//멤버 변수
	private String name;
	private String major;//전공
	private int year;//학년
	private String num;//학번
	private double point;//학점
	private int money;//등록금
	private int save;//장학금
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSave() {
		//장학금 계산(3.5이상 100만원, 4.0이상 250만원, 4.3이상 전액)
		if(point >= 4.3) {
			save = money;
		}else if(point >= 4.0) {
			save = 2500000;
		}else if(point >= 3.5) {
			save = 1000000;
		}
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}
	
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t학점\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+"\t"+money+"\t"+save);
	}
	

}
