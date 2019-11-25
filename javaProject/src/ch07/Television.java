package ch07;

public class Television {
	//멤버 변수
	int channel; //채널 번호
	int volume; //볼륨
	boolean on_Off;//전원 상태
	void print() {
	System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}

}
