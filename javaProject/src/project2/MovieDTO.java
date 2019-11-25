package project2;

import java.sql.Date;

public class MovieDTO {
	private String movie;
	private String type;
	private double grade; 
	private Date open; 
	private String director; 
	private int audience;
	public MovieDTO() {
	}
	public MovieDTO(String movie, String type, double grade, Date open, String director, int audience) {
		super();
		this.movie = movie;
		this.type = type;
		this.grade = grade;
		this.open = open;
		this.director = director;
		this.audience = audience;
	}
	@Override
	public String toString() {
		return "MovieDTO [movie=" + movie + ", type=" + type + ", grade=" + grade + ", open=" + open + ", director="
				+ director + ", audience=" + audience + "]";
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Date getOpen() {
		return open;
	}
	public void setOpen(Date open) {
		this.open = open;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAudience() {
		return audience;
	}
	public void setAudience(int audience) {
		this.audience = audience;
	}
	
}
