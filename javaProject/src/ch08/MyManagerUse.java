package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		MyManager mgrobj = MyManager.getIncstance();
		System.out.println("mgrobj.getScore():"+mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore():"+mgrobj.getScore());
		
		MyManager newMgr=MyManager.getIncstance();
		System.out.println("newMgr.getScore():"+newMgr.getScore());
		
	}
}
