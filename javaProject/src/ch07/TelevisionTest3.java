package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.on_Off = true;
		myTv.print();
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.on_Off = true;
		yourTv.print();
		
	}

}
