package ch04;

public class IfelseExam {

	public static void main(String[] args) {
		int java=90, html=85, jsp=95, db=76, tot=java+html+jsp+db;
		double avg=tot/4.0;
		String grade="";
		if (avg>=90) {
			grade="수";
		}else if(avg>=80) {
			grade="우";
		}else if(avg>=70) {
			grade="미";
		}else if(avg>=60) {
			grade="양";
		}else {
			grade="가";
		}
		
		System.out.println("java\thtml\tjsp\tdb\ttot\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.1f\t%s",java,html,jsp,db,tot,avg,grade);

	}

}
