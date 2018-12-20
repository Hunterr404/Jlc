package com.dharmu.jlc.iopackage;

import java.io.*;

public class Lab26 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			AddressA ad = new AddressA("33/1", "mathikere");
			StudentD st = new StudentD(99, "Sri", 65799999, ad);
			StudentC.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class AddressA{
	String aid;
	String street;
	AddressA(){}
	AddressA(String aid, String street){
		this.aid= aid;
		this.street=street;
		
	}
	public String toString() {
		return aid+"\t"+street;
	}
}
class StudentD implements Externalizable{
	int sid;
	transient String name = "XXXX";
	long phone = 3333333;
	static int count = 3;
	AddressA add;
	public StudentD() {}//Must have public no-arguments Constructor 
	StudentD(int sid, String name,long phone,AddressA add){
		this.sid= sid;
		this.name = name;
		this.phone=phone;
		this.add=add;
	}
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count+"\t"+add;
	}
	public void writeExternal(ObjectOutput out) throws IOException{
		out.write(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
		
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		count = in.readInt();
		name = in.readObject().toString();
		add = new AddressA();
		add.aid = in.readObject().toString();
		add.street = in.readObject().toString();
	}
}