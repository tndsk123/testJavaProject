package ch16;

public class MusicPlayer extends Thread{
	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
		
	}
	@Override
	public void run() {
		//type이 무엇이냐에 따라서 musicBox가 가지고 있는 메소드가 다르게 호출
		switch(type) {
		case 1 : musicBox.playMusicA();
		case 2 : musicBox.playMusicB();
		case 3 : musicBox.playMusicC();
		}
		
		
	}

}
