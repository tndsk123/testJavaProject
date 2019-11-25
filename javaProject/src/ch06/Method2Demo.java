package ch06;

public class Method2Demo {

	public static void main(String[] args) {
		System.out.println("합(1~10) : "+sum(1,10));
		System.out.println("합(10~100) : "+sum(10,100));
		System.out.println("합(100~1000) : "+sum(100,1000));
	}//end main()
	
	public static int sum(int i1,int i2) {//call by value
		int sum=0;
		for(int i=i1; i<=i2; i++)
			sum += i;
		return sum;
	}//end sum()method
	
	//method overloading
//	public static int sum(int i1) {//call by value
//		int sum=0;
//		for(int i=i1; i<=i1; i++)
//			sum += i;
//		return sum;
//		
//	}
}
