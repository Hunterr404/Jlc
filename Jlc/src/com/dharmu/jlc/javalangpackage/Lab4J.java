package com.dharmu.jlc.javalangpackage;

public class Lab4J {

	public static void main(String[] args) {
		JlcService serv = new JlcService();
		byte b1 = 12;
		byte b2 = 23;
		serv.show(b1,b2);

	}

}
class JlcService{
	/*void show(int ab,int bc) {
		System.out.println("\n --show(int,int)");
	}*/
	/*void show(byte ab,byte bc) {
		System.out.println("\n--show(byte,byte)");
	}*/
	/*void show(Byte ab,Byte bc) {
		System.out.println("\n--show(Byte,Byte)");
	}*/
	void show(byte...ab) {
		System.out.println("\n--show(byte)");
	}
}