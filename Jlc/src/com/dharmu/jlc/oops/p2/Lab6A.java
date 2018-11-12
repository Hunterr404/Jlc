package com.dharmu.jlc.oops.p2;
import com.dharmu.jlc.oops.HelloP;
class Xyz extends HelloP{
	
}
class HaiP extends HelloP{
	void show() {
		System.out.println("Hai-->show()");
		HelloP h=new HelloP();
		//System.out.println(h.ab);//The field HelloP.ab is not visible
		Xyz ref=new Xyz();
		//System.out.println(ref.ab);//The field HelloP.ab is not visible
	}
}
public class Lab6A {

	public static void main(String[] args) {
		HaiP hai=new HaiP();
		hai.show();
	}

}
