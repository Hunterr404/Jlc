package com.dharmu.jlc.reflection;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
public class Lab13 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fully Classified Name :");
		String cName =sc.nextLine();
		Class cl1 = Class.forName(cName);
		DataInputStream dis = new DataInputStream(System.in);
		Method ms[] = cl1.getDeclaredMethods();
		for(int i=0;i<ms.length;i++) {
			Method m = ms[i];
			m.setAccessible(true);
			System.out.println("\n Calling the Method "+m.getName());
			Object objReq = null;
			int mod = m.getModifiers();
			boolean st = Modifier.isStatic(mod);
			if(!st) {
				objReq = cl1.newInstance();
			}
			Class params[] = m.getParameterTypes();
			Object[] reqArgs = new Object[params.length];
			for(int j=0;j<params.length;j++) {
				String type = params[j].getName();
				System.out.println("Enter Value of Type \t:"+type);
				String val = dis.readLine();
				if(type.equals("boolean"))
					reqArgs[j] = new Boolean(val);
				else if(type.equals("byte"))
					reqArgs[j] = new Byte(val);
				else if(type.equals("char"))
					reqArgs[j] = new Character(val.charAt(0));
				else if(type.equals("short"))
					reqArgs[j] = new Short(val);
				else if(type.equals("int"))
					reqArgs[j] = new Integer(val);
				else if(type.equals("long"))
					reqArgs[j] = new Long(val);
				else if(type.equals("float"))
					reqArgs[j] = new Float(val);
				else if(type.equals("double"))
					reqArgs[j] = new Double(val);
				else if(type.equals("java.lang.String"))
					reqArgs[j] = val;
			}
			Object res = m.invoke(objReq, reqArgs);
			System.out.println("Result is\t:"+res);
		}
	} 

}
class Student13{
	private void showDetails() {
		System.out.println("--showDetails () of Student \t:"+this);
	}
	static int searchId(int ab,String bc,boolean b1) {
		System.out.println("--searchid() of Student");
		System.out.println("ab\t:"+ab);
		System.out.println("bc\t:"+bc);
		System.out.println("b1\t:"+b1);
		return 99;
	}
	boolean verifyStudent(char ch,String bc,boolean b1,long val,float f1) {
		System.out.println("verifyStudent() of Student\t:"+this);
		System.out.println("ch\t:"+ch);
		System.out.println("bc\t:"+bc);
		System.out.println("b1\t:"+b1);
		System.out.println("val\t:"+val);
		System.out.println("f1\t:"+f1);
		return true;
	}
}
