package com.dharmu.jlc.oops.p2;
import com.dharmu.jlc.oops.AX;
public class EX {
public void showE() {
	System.out.println("E-->show()");
	AX a1=new AX();
	//System.out.println(a1.a);//The field A.a is not visible
	//System.out.println(a1.b);//The field A.b is not visible
	//System.out.println(a1.c);//The field A.c is not visible
	System.out.println(a1.d);
}
}
