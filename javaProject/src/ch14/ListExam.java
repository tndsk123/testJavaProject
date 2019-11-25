package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector와 사용법이 비슷하지만 좀 더 가볍고 속도가 빠름
public class ListExam {
	public static void main(String[] args) {
		//ArrayList<Object> list= new AraayList<>();
		List<Object> list=new ArrayList<>();//다형성 형태로 생성
		
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+"\t");
		
		System.out.println();
		list.add(3,4);
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+"\t");
		System.out.println();
		
		list.remove(0);
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+"\t");
	}

}
