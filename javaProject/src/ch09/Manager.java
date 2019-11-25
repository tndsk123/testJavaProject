package ch09;

public class Manager extends Emplyee{
	private int pernum, salary;
	
	public Manager(String name, String address, int pernum, int salary) {
		setName(name);
		setAddress(address);
		this.pernum = pernum;
		this.salary = salary;
		
	}
	
	public void print() {
		System.out.println("-----------------------");
		System.out.println("이름 : "+ getName());
		System.out.println("주소 : "+ getAddress());
		System.out.println("주민번호 :"+pernum);
		System.out.println("연봉 : "+salary);
		System.out.println("-----------------------");
		
	}

}
