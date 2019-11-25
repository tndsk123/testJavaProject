package ch08;

public class Book {//도서판매정보 클래스
	private String bookName, author, press;
	private int year, price, amount, money;
	
	public Book() {
		//this()는 다른 생성자를 호출, 첫라인에 작성
		this("자바","김철수","한빛",2016,20000,10);
		System.out.println("기본생성자 호출");
	}

	public Book(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}

}

