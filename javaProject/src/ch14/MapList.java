package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) 
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		
	}
	
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//HashMap 객체 생성
		List<Student> list = new ArrayList<>();//리스트 객체 생성 및 Student 추가
		list.add(new Student("2017001","kim","국사",1,"park"));
		list.add(new Student("2016002","choi","영문",2,"hong"));
		list.add(new Student("2015003","lee","전산",3,"min"));
		map.put("list", list);//맵에 리스트 추가
		
		print(map);//압축파일처럼 list 안의 3개의 객체가 map에 담겨져 print쪽의 매개변수화되어 넘김
			
	}

}
