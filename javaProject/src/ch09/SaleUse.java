package ch09;

public class SaleUse {
	public static void main(String[] args) {
		Sale s1 = new Sale();
		
		s1.input(1, "냉장고", "LG", "2019-09-26", 1000000, 10);
		s1.calc();
		s1.print();
	}

}
