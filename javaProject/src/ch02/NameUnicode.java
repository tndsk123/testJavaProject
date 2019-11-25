package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		char a = '\uAE40';
		char b = '\uC601';
		char c = '\uC218';
		System.out.println("\uAE40 \uC601 \uC218");
		System.out.println("char형(\'\\uAE40'):"+a+"\t");
		System.out.println("char형(\'\\uC601'):"+b);
		System.out.println("char형(\'\\uC218'):"+c);
			

	}

}
