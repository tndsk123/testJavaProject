package ch07;

public class BookStoreUse {
	public static void main(String[] args) {
		BookStore b1 = new BookStore();
		b1.setBookName("Java");
		b1.setAuthor("김선생") ;
		b1.setPress("영진");
		b1.setYear(2019);
		b1.setPrice(30000);
		b1.setAmount(10);
		b1.getMoney();


	}

}
