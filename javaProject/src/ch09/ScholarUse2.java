package ch09;

public class ScholarUse2 {
	public static void main(String[] args) {
		Scholar2 c1 = new Scholar2();
		c1.output("김철수", "20190926", "컴공", 1, "A");
		c1.print();
		
		c1.input("홍길동", "20170814", "전자", 3);
		c1.print2();
		
		c1.input("홍길동","20170814");
		c1.print3();
	}

}

