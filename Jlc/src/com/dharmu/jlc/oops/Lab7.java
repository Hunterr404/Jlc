package com.dharmu.jlc.oops;

public class Lab7 {
public static void main(String as[]) {
	Lab7Person pob= null;
	pob=new Lab7Student();
	pob.eating();
	pob.walking();
	pob.sleeping();
	Lab7Student stu = (Lab7Student)pob;
	stu.reading();
	//pob.reading();//The method reading() is undefined for the type Lab7Person
	pob= new Lab7Employee();
	pob.eating();
	pob.walking();
	pob.sleeping();
	Lab7Employee emp = (Lab7Employee)pob;
	emp.working();
	//pob.working();//The method working() is undefined for the type Lab7Person
}
}
