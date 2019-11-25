package ch14;

import java.util.Vector;

//컬렉션(Collection) - 배열의 단점을 보완한 클래스들
//배열의 단점 - 사이즈 조절이 안됨, 삽입 및 삭제가 어려움, 다양한 자료형을 저장할 수 없음
//컬렉션 Map계열 - 순서는 제공되지 않지만 키가 제공됨(인덱스가 없고 키가 있음)
//List계열 - 순서대로 저장, 키가 없음(인덱스로 조회)
//Vector대신 요즘 ArrayList를 많이 쓴다.

public class VectorExam {
	public static void main(String[] args) {
//		Vector v = new Vector(); 에러는 아니지만 아래처럼 처리하는게 좋음
		Vector<Object> v = new Vector<>();
		//모든 자리형 처리 가능
		//사이즈가 자동으로 늘어남
		System.out.println("초기사이즈:"+v.capacity());
		//벡터는 기본적으로 10개의 사이즈(방)를 만들어 놓는다.
		//capacity()를 활용하여 길이 값을 알아낼 수 있다.
		v.add("first");//List계열은 add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("중간사이즈:"+v.capacity());
		//입력된 데이터가 벡테가 만들어 놓은 초기 10개의 사이즈가 넘어가면 10개의 사이즈를 추가로 만든다.
		
		System.out.println("데이터의 개수:"+v.size());
		//벡터.size()를 통해 실제 데이터 갯수를 알 수 있으며, 이는 배열의 length와 같다.
		
		System.out.println("초기 데이터:");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		
		System.out.println();
		
		v.add(6, 102);
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		
		System.out.println();
		
		v.remove(6);//벡터.remove()벡터의 인덱스번 요소 삭제
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		
	}

}
