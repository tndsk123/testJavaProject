package ch09;

public class Emplyee {
	private String name, address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input(String name, String address) {
		this.name = name;
		this.address = address;
	}
	

}
