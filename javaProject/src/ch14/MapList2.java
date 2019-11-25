package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList2 {
	static void print(Map map) {
		ArrayList<Student2> list = (ArrayList<Student2>)map.get("list");
		for(Student2 s : list)
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getSub()+"\t"+s.getScore());
	}
	
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();
		List<Student2> list = new ArrayList<>();
		System.out.println("-----------------------------");
	    System.out.println("학번       이름      과목       점수");
		list.add(new Student2(2017001,"김철수","Java",90));
		list.add(new Student2(2016002,"홍길동","JSP",80));
		list.add(new Student2(2015003,"사임당","DB",70));
		list.add(new Student2(2014004,"이순신","HTML",95));
		map.put("list",list);
		
		print(map);
		System.out.println("-----------------------------");
	}

}
