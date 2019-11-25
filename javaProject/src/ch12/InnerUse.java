package ch12;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {//new 생성자(){}; = 무명클래스

			@Override
			public void takeOff() {
				System.out.println("take Off");				
			}

			@Override
			public void fly() {
				System.out.println("fly");
			}

			@Override
			public void land() {
				System.out.println("land");
			}
			
		};//무명내부클래스
		f.takeOff();
		f.fly();
		f.land();
	}//end main()

}
