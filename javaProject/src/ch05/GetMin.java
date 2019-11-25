package ch05;
//최소값 찾기
public class GetMin {
	
	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int min;
		
		min = s[0];//12
		for(int i=1; i<s.length; i++) {
			if(s[i]<min)
				min=s[i];
		}
		System.out.println("최소값은 : "+min);
		
	}

}
