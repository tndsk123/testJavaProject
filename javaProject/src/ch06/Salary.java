package ch06;

public class Salary {//급여계산 프로그램
	static String[] name = {"박과장","김과장","이대리","최주임","홍실장"};
	
	static int[] salary = {2800,3000,2500,2000,3500};//연봉
	static int[] total = new int[5];
	static int[] bonus = {0,0,0,0,0};
	static int[] tax = new int[5];
	static int[] pay = new int[5];
	static int pay_tot;
	
	static void clac() {//계산 method(보너스,총액,세금,실수령액 계산)
		for(int i=0; i<name.length; i++) {
			bonus[i] = (int)(salary[i]*0.3);//연봉의 30%
			total[i] = salary[i] + bonus[i];//총액(연봉+보너스)
			tax[i] = (int)(total[i]*0.03);//세금(총액의 3%)
			pay[i] = total[i]-tax[i];//실수령액(총액-세금)
			pay_tot = pay_tot + pay[i];
		}//end for
		
	}//end calC()
	
	static void print() {//출력 method
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}//end for
		System.out.println("실수령액 합계 : "+pay_tot);
		System.out.println("실수령액 평균 : "+pay_tot/5);
		
	}
	public static void main(String[] args) {
		clac();
		print();
	}

}
