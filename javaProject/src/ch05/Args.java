package ch05;

public class Args {

	public static void main(String[] args) {
		//배열참조변수.length =>배열의 사이
        //배열참조변수[인덱스] => 인덱스는 0부터 시작
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 매개변수:"+args[i]);
		}
		

	}

}
