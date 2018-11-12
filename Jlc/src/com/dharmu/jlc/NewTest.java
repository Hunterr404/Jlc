package com.dharmu.jlc;

public class NewTest {

	public static void main(String[] args) {
		NewTest t=new NewTest();
		int a[]={34,23,12,88,25,9};
		t.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		//t.printArray(a);
		
	}


		void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			
			int n=a.length;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[i]) {
					
					int temp=a[j];
					a[j]=a[i];
					a[i] = temp;
					
				}
					
			}
		}
		
		}	
		/*void printArray(int a[]) {
			for(int i=0;i<a.length;++i) {
				System.out.println(a[i]);
				System.out.println();
			}
		}*/

}