package com.dharmu.jlc.javalangpackage;

public class Lab4X {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student4X st = new Student4X(99);
		System.out.println(st.sid);
		Student4X st2 = st.myclone();
		System.out.println(st2.sid);
		System.out.println(st==st2);

	}

}
interface JLCCloneable{}
class Student4X implements JLCCloneable{
	int sid;
	Student4X(int sid){
		this.sid=sid;
	}
	public Student4X myclone() throws CloneNotSupportedException{
		if(this instanceof JLCCloneable)
			return new Student4X(sid);
	else
		throw new CloneNotSupportedException("Implement JLCCloneable");
	
	
	}	
}