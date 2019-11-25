package ch13;

public class WrapperEx {
	public static void main(String[] args) {
		//Character사용
		System.out.println(Character.toLowerCase('A'));
		//'A'를 소문자로 변환
		char c1='4', c2='F';
		if(Character.isDigit(c1))//숫자냐?
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2))//영문자냐??
			System.out.println(c2+"는 영문자");
		
		//Integer 사용
		System.out.println(Integer.parseInt("200"));//문자열 "200"을 10진수로 변환
		System.out.println(Integer.toString(200));//정수 200을 문자열 200으로 변환
		System.out.println(Integer.toBinaryString(200));//정수200을 2진수로 변환
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue());//정수를 double 값으로 변환
		
		Double d = new Double(3.14);
		System.out.println(d.toString());//Double을 문자열 "3.14"로 변환
		
		boolean b = (4>3); //b=true
		System.out.println(Boolean.toString(b));//boolean형 true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));//false문자열을 boolean형 false로 변환
	}

}
