package project4;

public class WeatherDTO {
	private String name;
	private String tem;
	private String con;
	private String hum;
	private String pro;
	public WeatherDTO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTem() {
		return tem;
	}
	public void setTem(String tem) {
		this.tem = tem;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	
	public WeatherDTO(String name) {
		this.name = name;
	}
	public WeatherDTO(String name, String tem, String con, String hum, String pro) {
		this.name = name;
		this.tem = tem;
		this.con = con;
		this.hum = hum;
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "WeatherDTO [name=" + name + ", tem=" + tem + ", con=" + con + ", hum=" + hum + ", pro=" + pro + "]";
	}
	

}
