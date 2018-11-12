package com.dharmu.jlc.javalangpackage;

public class Lab2F {

	public static void main(String[] args) {
		Employee2F emps[]=new Employee2F[500];
		for(int i=0;i<emps.length;i++) {
			new Employee2F("JLC-" + (i+1));
			emps[i]=new Employee2F("Jlc- "+ (i+1));
		}

	}

}
class Employee2F{
	String eid;
	double add[] = new double[123456];
	Employee2F(String eid) {
		this.eid=eid;
		System.out.println("\n Object Created with id :"+eid);
	}
	protected void finalize() {
		System.out.println("Finalize-"+eid);
	}
}