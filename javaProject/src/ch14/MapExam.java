package ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		//List : 순서대로 저장, Map : 순서가 없음(key,value 처리)
		//Map<key자료형, value자료형>
		Map<String, String> map=new HashMap<>();
		map.put("한국", "서울");//맵.put(key,value)
		System.out.println(map.get("한국"));
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국","워싱턴");
		map.put("태국","방콕");
		map.put("영국","런던");
		System.out.println(map);
		String nation="영국";
		System.out.println(nation+"의 수도는 "+map.get(nation));
		
		//Itreator : 반복처리를 위한 객체 (for문과 유사한 기능)
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {//다음 요소가 있으면
			String key=(String)iterator.next();
			System.out.print("key="+key);
			System.out.println("value="+map.get(key));
		}
	}

}
