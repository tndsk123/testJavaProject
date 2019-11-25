package ch08;

public class Member {//CustomerInformation Class
//이름, 아이디, 구매금액, 회원등급
//회원등급 : 구매금액이 10만원 이상 골드회원, 그렇지 않으면 실버회원
//입력값 : 이름, 아이디, 구매금액
//출력값 : 이름, 아이디, 구매금액, 회원등급
	private String name,userid,grade;
	private int money;
	//Ctrl+Space => Constructor... -> 기본생성자 자동코드 생성
	public Member() {
		System.out.println("기본 생성자 호출...");
	}
	//매개변수가 있는 생성자
	public Member(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	public void input(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	public String getGrade() {
		if(money >=100000) {
			grade="gold";
		}else {
			grade="siver";
		}
		return grade;

	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
}
