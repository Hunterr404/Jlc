package com.dharmu.jlc.oops;
class A3{}
class B3 extends A3{}
class C3 extends A3{}
class D3 extends B3{}
class E3{}
public class Lab8G {

	public static void main(String[] args) {
		D3 dobj = new D3();
		A3 aobj = dobj;
		//B3 bobj = aobj;
		//D3 dobj1 =aobj;
		B3 bobj1 = (B3)aobj;
		D3 dobj2 = (D3)aobj;
		
		A3 aobj1 = new D3();
		//C3 cobj=(C3)aobj1;
		
		A3 aobj2 = new D3();
		if(aobj2 instanceof C3) {
			C3 cobj1=(C3)aobj2;
			}
		//E3 eobj =(E3)aobj2;//Cannot cast from A3 to E3
		
		System.out.println(aobj1 instanceof A3);
		System.out.println(aobj1 instanceof B3);
		System.out.println(aobj1 instanceof C3);
		System.out.println(aobj1 instanceof D3);
		System.out.println();
		//System.out.println(aobj1 instanceof E3);//Incompatible conditional operand types A3 and E3
		A3 aob=new D3();
		D3 dob=new D3();
		B3 bob=new B3();
		C3 cob=new C3();
		System.out.println(aob==dob);
		System.out.println(aob==bob);
		System.out.println(aob==cob);
		E3 eob=new E3();
		//System.out.println(aob=eob);//Type mismatch: cannot convert from E3 to A3
		//System.out.println(bob==cob);//Incompatible operand types B3 and C3
		
	}

}
