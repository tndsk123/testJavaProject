package ch14;

public class ProdEx {
	private String name, num, com;
	private int price, amount, money;
	
	public ProdEx() {}

	public ProdEx(String name, String num, String com, int price, int amount, int money) {
		super();
		this.name = name;
		this.num = num;
		this.com = com;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getNum() {return num;}
	public void setNum(String num) {this.num = num;}
	public String getCom() {return com;}
	public void setCom(String com) {this.com = com;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	public int getMoney() {
		money = price*amount;
		return money;
	}
	public void setMoney(int money) {this.money = money;}
		
}
