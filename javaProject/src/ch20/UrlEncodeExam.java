package ch20;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeExam {
	//url에는 한글,특수문자가 포함될 수 없음.
	//url encoding(인코딩) ==>한글, 특수문자를 url형식으로 변환시킴
	//url decoding(디코딩) ==>인코딩된 문자열을 처음 내용으로 복원시킴
	public static void main(String[] args) {
		try {
			String str="김철수";
			System.out.println(URLEncoder.encode(str, "utf-8"));
			System.out.println(URLDecoder.decode("%EA%B9%80%EC%B2%A0%EC%88%98", "utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
