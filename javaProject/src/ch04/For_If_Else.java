package ch04;
//for문 안에 if else를 사용한 1부터 10까지의 합
public class For_If_Else {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {//1~10까지 반복
			 sum += i;//sum=sum+i
			 System.out.print(i);
			 if(i<=9)
				 System.out.print("+");
			 else {
				 System.out.print("=");//"=" 출력하고
				 System.out.println(sum);// 덧셈 결과 출력
			 }//end else
		}//end for

	}//end main()

}
