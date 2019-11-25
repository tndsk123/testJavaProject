package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a= 10;
		Object obj=20;
		//좌변:부 = 우변:자 (다형성)
		a = (Integer) obj;//정상적인 형변환, (int)obj도 가능
		//obj가 객체형이기 때문에 (Integer)로 써야하는데, (int)도 가능하다. 
		System.out.println(a);
		
		Object[] obj2 = {100,100.5,true,"hello",'A'};
		//Object클래스는 모든 형을 다 포함
		//그러나 각 데이터가 Object 객체(Integer,Double,Boolean.....)가 되어버린다.(오토박싱)
		//그래서 메모리 낭비 심각, 실행시간도 길어짐 ->실제로 이렇게 쓰는일이 없다. 대신 컬렉션처리(ArrayList 등)
		for(Object o : obj2) {//향상된 for문
			System.out.println(o);
		}
	}

}
