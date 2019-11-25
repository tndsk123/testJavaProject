package ch05;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = {
				{3.3,3.4},//1학년 평점(1학기,2학기)
				{3.5,3.6},//2학년 평점
				{3.7,4.0},//3학년 평점
				{4.1,4.2}};//4학년 평점
		
		double sum=0.0;
		for(int year=0; year<score.length; year++) {//각 학년별로 반복
			for(int term=0; term<score[year].length; term++) {//각 학기별로 반복
				sum += score[year][term];//전체 평점 합
			}//end inner for
		}//end outer for
		int n=score.length;//배열 행의 개수
		int m=score[0].length;//배열 열의 개수
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));

	}

}
