package ch15;


public class ThrowsExam {
	//예외처리방법
	//1)try~catch:직접처리
	//2)throws:예외처리클래스를 시스템에 위임
	//메소드이름 throws 예외처리클래스1,예외처리클래스2,....{}
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cpu 간섭)
		}
	}

}
