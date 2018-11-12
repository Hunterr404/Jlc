package com.dharmu.jlc.javalangpackage;

public class Lab3N {

	public static void main(String[] args) {
		String str="Hai, Welcome to JLC(Java learning Center), Java World";
		String str1=str.replace('J', 'X');
		System.out.println(str1);
		String str2=str.replaceFirst("Java", "SD");
		System.out.println(str2);
		String str3=str.replaceAll("Java", "SD");
		System.out.println(str3);
		System.out.println(str);
		
		String st="Welcome to JLC, Java Training Center, No. 1 in Java Training and Placement";
		System.out.println(st.indexOf(97));//{int java.lang.String.indexOf(int ch)} -the index (in Unicodecode units) of the first occurrence is returned
		System.out.println(st.indexOf('a'));
		System.out.println("\n");
		
		System.out.println(st.indexOf('J'));
		System.out.println(st.indexOf('J', 11));
		System.out.println(st.indexOf('J', 12));
		System.out.println(st.indexOf('J', 17));
		System.out.println("\n");
		
		System.out.println(st.indexOf("Java"));
		System.out.println(st.indexOf("Java",16));
		System.out.println(st.indexOf("Java", 17));
		System.out.println("\n");
		
		System.out.println(st.lastIndexOf(97));//Here(97='a' in Unicode)Returns the index within this string of the last occurrence ofthe specified character in Unicode codeunits
		System.out.println(st.lastIndexOf('a'));
		System.out.println(st.length());
		System.out.println("\n");
		
		System.out.println(st.lastIndexOf("Java"));
		System.out.println(st.lastIndexOf("Java",46));//the index of the last occurrence of the specified substring,searching backward from the specified index,or -1 if there is no such occurrence.
		System.out.println(st.lastIndexOf("Java", 45));

	}

}
