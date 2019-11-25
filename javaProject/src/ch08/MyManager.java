package ch08;

public class MyManager {
	private int score;
	
	private MyManager(int score) {//싱글톤처리
		this.score = score;
	}
	
	private static MyManager mgr;
	public static MyManager getIncstance() {
		if(mgr==null) {
			mgr=new MyManager(10);
		}
		return mgr;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}

}
