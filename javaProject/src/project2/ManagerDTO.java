package project2;

public class ManagerDTO {
	private String name;
	private String id; 
	private String pwd;
	private String position;
	public ManagerDTO() {
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public ManagerDTO(String name, String id, String pwd, String position) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.position = position;
	}
	@Override
	public String toString() {
		return "ManagerDTO [name=" + name + ", id=" + id + ", pwd=" + pwd + ", position=" + position + "]";
	}
	
}
