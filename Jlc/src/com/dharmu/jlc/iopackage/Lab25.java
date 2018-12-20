package com.dharmu.jlc.iopackage;
import java.io.*;
public class Lab25 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			Address ad = new Address("33/1", "mathikere");
			StudentC st = new StudentC(99, "Sri", 65799999, ad);
			StudentC.count = 9;
			System.out.println(st);
			oos.writeObject(st);//java.io.NotSerializableException:
			System.out.println("Object Serialized");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
//class Address implements Serializable
class Address{//causes java.io.NotSerializableException:
	String aid;
	String street;
	Address(String aid, String street){
		this.aid= aid;
		this.street=street;
		
	}
	public String toString() {
		return aid+"\t"+street;
	}
}
class StudentC implements Serializable{
	int sid;
	transient String name = "XXXX";
	long phone = 3333333;
	static int count = 3;
	Address add;
	StudentC(int sid, String name,long phone,Address add){
		this.sid= sid;
		this.name = name;
		this.phone=phone;
		this.add=add;
	}
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count+"\t"+add;
	}
}