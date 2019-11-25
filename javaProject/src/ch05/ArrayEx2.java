package ch05;

public class ArrayEx2 {
	public static void main(String[] args) {
		String[] name = {"홍길동", "이몽룡", "성춘향"};
		int[] Java = {100,80,70};
		int[] DB = {80,90,95};
		int[] HTML = {99,89,79};
		int[] JSP = {85,92,88};
		int[] total = {0,0,0};
		double[] avg = new double[3];
		double tot_avg=0;
		
		for(int i=0; i<name.length; i++) {
			total[i]=Java[i]+DB[i]+HTML[i]+JSP[i];
			avg[i]=total[i]/4.0;
			tot_avg=tot_avg+avg[i];
		}
		System.out.println("=====================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\ttotal\tavg");
		System.out.println("=====================================================");
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+Java[i]+"\t"+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]+"\t"+total[i]+"\t"+String.format("%5.1f", avg[i]));
		}
		System.out.println("=====================================================");
		System.out.println("학급평균 : "+String.format("%5.1f",tot_avg/3));
	}

}
