package ch21_jdbc;

public class AddressDTO {
	private String email; 
	private String name;
	private String addr;
	private String hp;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	public AddressDTO() {
	}
	

	public AddressDTO(String name, String addr, String hp, String email) {
		this.email = email;
		this.name = name;
		this.addr = addr;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "AddresssDTO [email=" + email + ", name=" + name + ", addr=" + addr + ", hp=" + hp + "]";
	} 
	
}
