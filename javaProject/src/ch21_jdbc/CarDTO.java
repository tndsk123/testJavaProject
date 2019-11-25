package ch21_jdbc;

//DTO : Data Transfer Object 데이터 저장 , 전달하는 객체, 하나의 레코드를 저장
//VO : Value Object 값을 저장하는 객체
public class CarDTO {
	private String license_number; 
	private String company; 
	private String TYPE; 
	private int year; 
	private int efficiency;
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	public CarDTO() {
	}
	public CarDTO(String license_number, String company, String TYPE, int year, int efficiency) {
		super();
		this.license_number = license_number;
		this.company = company;
		TYPE = TYPE;
		this.year = year;
		this.efficiency = efficiency;
	}
	@Override
	public String toString() {
		return "CarDTO [license_number=" + license_number + ", company=" + company + ", TYPE=" + TYPE + ", year=" + year
				+ ", efficiency=" + efficiency + "]";
	}

}
