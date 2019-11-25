package ch22_oracle_jdbc;

public class ProjectDTO {
	private String student_no; 
	private String name; 
	private int attendance; 
	private int late; 
	private int early; 
	private int go_out;
	private int absence;
	private int sum;
	public ProjectDTO() {
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getLate() {
		return late;
	}
	public void setLate(int late) {
		this.late = late;
	}
	public int getEarly() {
		return early;
	}
	public void setEarly(int early) {
		this.early = early;
	}
	public int getGo_out() {
		return go_out;
	}
	public void setGo_out(int go_out) {
		this.go_out = go_out;
	}
	public int getAbsence() {
		return absence;
	}
	public void setAbsence(int absence) {
		this.absence = absence;
	}
	@Override
	public String toString() {
		return "ProjectDTO [student_no=" + student_no + ", name=" + name + ", attendance=" + attendance + ", late="
				+ late + ", early=" + early + ", go_out=" + go_out + ", absence=" + absence + "]";
	}
	public ProjectDTO(String student_no, String name, int attendance, int late, int early, int go_out, int absence) {
		super();
		this.student_no = student_no;
		this.name = name;
		this.attendance = attendance;
		this.late = late;
		this.early = early;
		this.go_out = go_out;
		this.absence = absence;
	}
	public ProjectDTO(String student_no, String name, int attendance, int late, int early, int go_out, int absence, int sum) {
		super();
		this.student_no = student_no;
		this.name = name;
		this.attendance = attendance;
		this.late = late;
		this.early = early;
		this.go_out = go_out;
		this.absence = absence;
		this.sum=sum;
	}
	
	

}
