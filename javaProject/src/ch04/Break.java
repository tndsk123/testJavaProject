package ch04;

public class Break {
    
	public static void main(String[] args) {
	   int i=1;
	   //break : switch, for while, do~while 등에서 모두 사용됨
	   while(true) {
		   System.out.println(i++);
		   if(i>10)
			   break;//반복문 종료
	   }
	   System.out.println("프로그램 종료");
      }
}
