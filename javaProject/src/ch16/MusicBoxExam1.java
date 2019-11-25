package ch16;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();//객체 생성
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer kang = new MusicPlayer(3, box);
		
		kim.start();
		lee.start();
		kang.start();
	}

}
