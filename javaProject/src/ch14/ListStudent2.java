package ch14;


import java.util.ArrayList;
import java.util.List;

public class ListStudent2 {
	public static void main(String[] args) {
		List<Student2> l = new ArrayList<>();
		
		Student2 s = new Student2();
		s.setNum(2017001);
		s.setName("김철수");
		s.setSub("Java");
		s.setScore(90);
		
		l.add(s);
		
		Student2 s1 = new Student2(2016002,"홍길동","JSP",80);
		l.add(s1);
		
		l.add(new Student2(2015003,"사임당","DB",70));
		l.add(new Student2(2014004,"이순신","HTML",95));
		
		System.out.println("-----------------------------");
		System.out.println("학번\t이름\t과목\t점수");
		for(Student2 m : l) {
			System.out.println(m.getNum()+"\t"+m.getName()+"\t"+m.getSub()+"\t"+m.getScore());
		}
		System.out.println("-----------------------------");
	}

}
