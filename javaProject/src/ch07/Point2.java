package ch07;

public class Point2 {
	private String name, grade;
	private int Java, DB, HTML, JSP, tot;
	private double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		if(avg>=90) {
			grade="수";
		}else if(avg >=80){
			grade="우";
		}else if(avg>=70) {
			grade="미";
		}else if(avg>=60) {
			grade="양";
		}else {
			grade="가";
		}
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getJava() {
		return Java;
	}
	public void setJava(int java) {
		Java = java;
	}
	public int getDB() {
		return DB;
	}
	public void setDB(int dB) {
		DB = dB;
	}
	public int getHTML() {
		return HTML;
	}
	public void setHTML(int hTML) {
		HTML = hTML;
	}
	public int getJSP() {
		return JSP;
	}
	public void setJSP(int jSP) {
		JSP = jSP;
	}
	public int getTot() {
		tot = Java+DB+HTML+JSP;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg = tot/4.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void print() {
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균\t등급");
		System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML+"\t"+JSP+"\t"+getTot()+"\t"+String.format("%.2f", getAvg())+"\t"+getGrade());
	}

}
