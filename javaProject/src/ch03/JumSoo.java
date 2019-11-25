package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String 이름;
		int Java, HTML, JSP, DB, 총점;
		double 평균;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름:");
		이름 = scan.next();
		System.out.print("Java:");
		Java = scan.nextInt();
		System.out.print("HTML");
		HTML = scan.nextInt();
		System.out.print("JSP");
		JSP = scan.nextInt();
		System.out.print("DB");
		DB = scan.nextInt();
		scan.close();
		
		총점 = Java+HTML+JSP+DB;
		평균 = 총점/4.0;
		
		System.out.println("이름\tJava\tHTML\tJSP\tDB\t총점\t평균");
		System.out.println(이름+"\t"+Java+"\t"+HTML+"\t"+JSP+"\t"+DB+"\t"+총점+"\t"+평균);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%5.1f",이름,Java,HTML,JSP,DB,총점,평균);
		
		
		
		
		

	}

}
