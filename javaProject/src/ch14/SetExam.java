package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("Korea");
		hs.add("Japan");
		hs.add("America");
		hs.add("britain");
		hs.add("Korea");//중복값은 입력되지 않음
		System.out.println(hs);//순서대로 저장되지 않음
		for(String str: hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {//다음 요소가 있으면 true
			System.out.println(it.next());//다음 요소를 꺼냄
		}
		
		
	}

}
