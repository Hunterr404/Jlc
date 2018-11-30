package com.dharmu.jlc.javautil;
import java.util.*;
public class Lab4Q {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry());
		System.out.println(loc.getLanguage());
		System.out.println(loc.getDisplayLanguage());
		Locale locs[] = Locale.getAvailableLocales();
		for(int i=0;i<locs.length;i++) {
			Locale l = locs[i];
			System.out.println(l.getDisplayLanguage()+"\t\t"+l.getDisplayCountry());
		}
	}

}
 