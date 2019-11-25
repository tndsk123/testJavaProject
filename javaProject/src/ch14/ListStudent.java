package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("2017001","김철수","국사",1,"박교수"));
		list.add(new Student("2016002","홍길동","영문",2,"최교수"));
		list.add(new Student("2015003","사임당","전산",3,"김교수"));
		
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		for(Student s : list) {//향상된 for문
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
		
	}

}
