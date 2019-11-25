package project3;

public class LoginDTO {
	private String id;
	private String pwd;
	private String name;
	private String birth;
	private String email;
	private String phone;
	private String address;
	public LoginDTO() {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LoginDTO(String id, String pwd, String name, String birth, String email, String phone, String address) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", birth=" + birth + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	

}
