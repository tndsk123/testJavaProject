package project3;

public class InvenDTO {
	private String product;
	private String name; 
	private String size; 
	private String company; 
	private String made;
	private String date;
	private int price;
	private int amount;
	public InvenDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public InvenDTO(String product, String name, String size, String company, String made, String date, int price,
			int amount) {
		super();
		this.product = product;
		this.name = name;
		this.size = size;
		this.company = company;
		this.made = made;
		this.date = date;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "InvenDTO [product=" + product + ", name=" + name + ", size=" + size + ", company=" + company + ", made="
				+ made + ", date=" + date + ", price=" + price + ", amount=" + amount + "]";
	}
	
	
}
