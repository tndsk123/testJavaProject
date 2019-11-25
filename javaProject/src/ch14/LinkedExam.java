package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//큐 구조 : FIFO(First In First Out)
		//입력 : offer, 출력 : poll
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList list = new LinkedList();
		for(String str : fruits) {
			list.offer(str);
		}
		String str="";
		while((str=(String)list.poll())!=null) {//poll()자료 꺼내기
			System.out.println(str+" 삭제되었습니다.");
			//poll()은 자료형이 E(미정)이기 때문에 (String)처럼 자료형을 적어주어야 한다.
			//또한 poll()한 값을 str에 대입하는데, str은 boolean이 아니기 때문에 전체로 묶어주어야 한다.
		}
	}

}
