package ch07;

public class TelevisionTest2 {
	
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.on_Off = true;
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.on_Off = true;
		
		System.out.println("나의 텔레비전 채널은 "+myTv.channel+"이고 볼륨은 "+myTv.volume+"입니다.");
		System.out.println("나의 텔레비전 채널은 "+yourTv.channel+"이고 볼륨은 "+yourTv.volume+"입니다.");
	}

}
