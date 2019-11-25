package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d = 0.1234;
		double e = 1234E-4; //1234E-4 = 1234의 마이너스 10의 4승이므로 0.1234와 동일
		float f = 0.1234f;//float형은 숫자 뒤 F또는f를 붙임
		double w = .1234D;//.1234D 와 0.1234는 동일
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
	}

}
