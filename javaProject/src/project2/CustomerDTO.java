package project2;

public class CustomerDTO {
	private String name;
	private String id; 
	private String pwd;
	private int age;
	private String phone;
	public CustomerDTO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public CustomerDTO(String name, String id, String pwd, int age, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", id=" + id + ", pwd=" + pwd + ", age=" + age + ", phone=" + phone + "]";
	}
	

}
