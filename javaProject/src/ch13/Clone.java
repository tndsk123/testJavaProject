package ch13;
//인스턴스를 복제하려면 Cloneable 인터페이스를 구현해야 함.
public class Clone implements Cloneable{
	int num=10;
	void print() {
		System.out.println(num);
	}
 	
	public static void main(String[] args) {
		Clone t1 = new Clone();
	    Clone t2=null;
	    try {//예외가 발생할 가능성의 코드
	    	t2=(Clone)t1.clone();//인스턴스를 복제
			
		} catch (CloneNotSupportedException e) {//예외가 발생한 시점의 스택정보 출력
			e.printStackTrace();//개발자를 위한 디버깅 정보를 제공
			
		}
	    System.out.println(t1);
	    System.out.println(t2);
	    t1.print();
	    t2.print();
	}
}
