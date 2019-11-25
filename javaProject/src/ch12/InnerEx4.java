package ch12;

class Outer{
	class InstanceInner{
		int iv=100;
	}//end class InstanceInner
	static class StaticInner{
		int iv=200;//non static
		static int cv = 300;//static
	}//end class StaticInner
	void myMethod() {
		class LocalInner{
			int iv=400;
		}//end LocalInner
		LocalInner li = new LocalInner();
		System.out.println("li.iv : "+li.iv);
	}//end myMehod()
}//end class Outer

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println("ii.iv : "+ii.iv);
		System.out.println("Outer.StaticInner.cv : "+ Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		//non-static member를 접근하기 위해서는 static class내에 있다 하더라도 객체생성해준다.
		System.out.println("si.iv : "+si.iv);
		
		oc.myMethod();
			}

}
