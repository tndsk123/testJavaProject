package ch05;

//비정방형 배열(가변형, 래그드배열)
//각 행의 열의 개수가 다른 배열

public class SkewedArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];//첫째 행의 3개의 열 생성
		intArray[1] = new int[2];//둘째 행의 2개의 열 생성
		intArray[2] = new int[3];//셋째 행의 3개의 열 생성
		intArray[3] = new int[2];//넷째 행의 2개의 열 생성
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10+j;
				
			}//end inner for
		}//end outer for
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}//end inner for
			System.out.println();
		}//end outer for

	}

}
