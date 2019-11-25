package ch09;

class Animal{
	public Animal (String s) {
		System.out.println("동물 : "+s);
	}
}

class Mammal extends Animal{
	public Mammal() {
		super("원숭이");//부모 클래스 생성자 호출
		System.out.println("포유류 : 원숭이");
	}//end Mammal()
	
	public Mammal(String s) {
		super(s);//부모 클래스 생성자 호출
		System.out.println("포유류 : "+s);
	}//end Mammal(String s)
}//end class Mammal

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal pae = new Mammal();
		Mammal lion = new Mammal("사자");
	}

}
