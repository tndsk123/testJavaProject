package ch08;

public class BookUse {
	public static void main(String[] args) {
		Book b = new Book();
		b.print();
		System.out.println("========================================================");
		Book b1 = new Book("HTML","김선생","영진",2017,30000,20);
		b1.print();
	}
}
