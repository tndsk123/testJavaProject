package ch07;

public class Student2 {
	private String name;
	private String major;//전공
	private int year;//학년
	private String num;//학번
	private double point;//학점
	private int money;//등록금
	private int save;//장학금
	
	public void input(String name,String major,int year,String num,double point,int money) {
		this.name = name;
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money =money;
		if(point >= 4.3) {
			save = money;
		}else if(point >= 4.0) {
			save = 2500000;
		}else if(point >= 3.5) {
			save = 1000000;
		}
	}//end input
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t학점\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+"\t"+money+"\t"+save);
	}

}
