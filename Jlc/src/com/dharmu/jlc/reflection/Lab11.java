package com.dharmu.jlc.reflection;

public class Lab11 {

	public static void main(String[] args) {
		try{
			String cname = "com.dharmu.jlc.reflection.User";
			Class cl = Class.forName(cname);
			Object obj = cl.newInstance();
			System.out.println(obj);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class User{
	User(){
		System.out.println("**User Default Constructor");
	}
}