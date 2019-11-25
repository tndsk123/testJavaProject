package ch08;

public class Member2 {
	private String name, id, sub, grade; 
	private int price;
	
	
	public Member2() {
		this("김철수","kim","냉장고",2000000);
		//System.out.println("기본생성자 호출...");
	    	
	}

	public Member2(String name, String id, String sub, int price) {
		//System.out.println("매개변수가 있는 생성자 호출...");
		this.name = name;
		this.id = id;
		this.sub = sub;
		this.price = price;
	}
	
	public void input(String name, String id, String sub, int price) {
		//System.out.println("매개변수가 있는 메소드 호출...");
		this.name = name;
		this.id = id;
		this.sub = sub;
		this.price = price;
		
		
	}
	public String getGrade() {
		if(price >= 1000000) {
			grade = "gold";
		}else if(price >=100000) {
			grade = "silver";
		}else {
			grade = "bronze";
		}
		return grade;
	}
	public void print() {
		
		System.out.println("이름\t아이디\t상품명\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+sub+"\t"+price+"\t"+grade);
		System.out.println("---------------------------------------");
	}

	

}
