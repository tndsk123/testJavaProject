package ch16;

public class CinemaBoxExam {
	public static void main(String[] args) {
		CinemaBox c = new CinemaBox();
		CinemaPlayer p1 = new CinemaPlayer(1, c);
		CinemaPlayer p2 = new CinemaPlayer(2, c);
		
		p1.start();
		p2.start();
	}

}
