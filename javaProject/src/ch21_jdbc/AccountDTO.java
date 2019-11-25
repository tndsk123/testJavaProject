package ch21_jdbc;

public class AccountDTO {
	private String bank; 
	private String num; 
	private String NAME;
    private int money;
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public AccountDTO(String bank, String num, String name, int money) {
		this.bank = bank;
		this.num = num;
		this.NAME = name;
		this.money = money;
	}
	@Override
	public String toString() {
		return "AccountDTO [bank=" + bank + ", num=" + num + ", NAME=" + NAME + ", money=" + money + "]";
	}
    public AccountDTO() {
	
	}

}
