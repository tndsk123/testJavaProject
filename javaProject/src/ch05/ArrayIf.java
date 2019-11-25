package ch05;

public class ArrayIf {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		if(arr!=null) {//arr이 주소번지가 null이 아니라면, 즉 주소값이 있으면
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+",");
			}//end for
		}//end if

	}

}
