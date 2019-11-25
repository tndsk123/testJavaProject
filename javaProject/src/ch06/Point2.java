package ch06;

public class Point2 {
	
	static String[] nam = {"홍길동","이순신","김유신"};
	static int[] Java = {80,89,90};
	static int[] DB = {90,99,80};
	static int[] HTML = {80,88,70};
	static int[] JSP = {78,92,100};
	static int[] tot = {0,0,0};
	static double[] avg = {0.0,0.0,0.0};
	
	static void operate() {
		for(int i=0; i<nam.length; i++) {
			tot[i] = Java[i]+DB[i]+HTML[i]+JSP[i];
			avg[i] = (double)(tot[i]/4);
		}
	}
	
	static void print() {
		System.out.println("------------------------------------------------------");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("------------------------------------------------------");
		for(int i=0; i<nam.length; i++) {
			System.out.println(nam[i]+"\t"+Java[i]+"\t"+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		System.out.println("------------------------------------------------------");
	}
	public static void main(String[] args) {
		operate();
		print();

  }
}