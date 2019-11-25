package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {
	public static void main(String[] args) {
		//캘린더 인스턴스 생성은 new로 만들 수 없음
		Calendar cal = Calendar.getInstance();//추상 클래스의 static 메소드임
		
		System.out.println(cal.get(Calendar.YEAR));//연도값
		System.out.println(cal.get(Calendar.MONTH)+1);//월은 0~11 (+1을 더함)
		System.out.println(cal.get(Calendar.DATE));//일
		System.out.println(cal.get(Calendar.HOUR));//12시간
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24시간
		System.out.println(cal.get(Calendar.MINUTE));//분
		System.out.println(cal.get(Calendar.SECOND));//초
		System.out.println(cal.get(Calendar.AM_PM));//오전 0, 오후 1
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));//1년 중 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));//월의 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//요일(일요일 1 ~ 토요일 7)
		String yoil = "";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : yoil = "일요일"; break;
		case 2 : yoil = "월요일"; break;
		case 3 : yoil = "화요일"; break;
		case 4 : yoil = "수요일"; break;
		case 5 : yoil = "목요일"; break;
		case 6 : yoil = "금요일"; break;
		case 7 : yoil = "토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"이다.");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//1년중 몇번 째 주
		
		Date date = cal.getTime();
		System.out.println(date.getYear()+1900);//deprecated된 메소드 ex)getYear - 더이상 쓰지 않는게 좋다.
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		
		
	}

}
