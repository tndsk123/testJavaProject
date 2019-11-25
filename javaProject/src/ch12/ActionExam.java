package ch12;

//추상클래스
abstract class Action{
	public abstract void exec();
}

class MyAction extends Action{
	public void exec() {
		System.out.println("exec");
	}
	
}


public class ActionExam {
	public static void main(String[] args) {
		Action action = new MyAction() {
			public void exec() {
				System.out.println("익명클래스 exec");
			}//end exec()
		};//익명클래스,생성자 다음에 중괄호 열고 닫고가 나오면,
		//해당 생성자 이름에 해당하는 클래스를 상속받는
		//이름 없는 객체를 만든다는 것을 의미한다.
		//익명클래스를 만드는 이유는 Action을 상속받는 클래스를
		//만들 필요가 없을 경우이다. 일회성 처리
		action.exec();
	}//end main()

}
