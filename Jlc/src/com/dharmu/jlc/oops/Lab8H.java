package com.dharmu.jlc.oops;
interface inter1Bi{
	
}
class A4 implements inter1Bi{}
class B4 extends A4{}
class C4 extends A4{} 
public class Lab8H {

	public static void main(String[] args) {
		inter1Bi arr[]=new inter1Bi[3];
		arr[0]=new A4();
		arr[1]=new B4();
		arr[2]=new C4();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		
		/*inter1Bi arr1[]=null;
		arr1=new B4[3];
		arr1[0]=new A4();//java.lang.ArrayStoreException
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		
		//inter1Bi arr2[]=new B4[3];*/
		
		inter1Bi arr2[]=new inter1Bi[3];
		arr2[0]=new B4();
		arr2[1]=new B4();
		arr2[2]=new C4();
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
	}

}
