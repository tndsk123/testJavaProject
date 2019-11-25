package ch02;
//지구에서 달까지의 거리 계산하기
public class CalTime {

	public static void main(String[] args) {
		final double Light_Speed=30e4;//빛의속도=300,000km/s
		double distance = 40e12;//달까지의 거리=약 40x10의 12승 km
	    double secs;
	    
	    secs = distance/Light_Speed;
	    
	    double light_year = secs/(60.0*60.0*24.0*365.0);//secs(초x분x시x일)
	    System.out.println("지구에서 달까지 걸리는 시간은 "+light_year+ " 광년입니다");

	}

}
