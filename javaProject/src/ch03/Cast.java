package ch03;

public class Cast {

	public static void main(String[] args) {
		float f =1.6f;//4byte로 저장
		System.out.println(f);
		
		f=100;//작은값-->큰값(자동형변환,auto casting)
		System.out.println(f);
		
		f=100.5f;
		
		int i=(int)f;//큰값-->작은값(강제형변환,명시적형변환)
		System.out.println(i);//소수점 이하는 손실됨
		
		i=300;
		byte b = (byte)i;//강제형변환
		System.out.println(b);//byte:-128~127-->범위 초과시 값의 왜곡현상
		
		
		
	}

}
