package com.dharmu.jlc.javalangpackage;
import java.math.BigInteger;
public class Lab4Q {

	public static void main(String[] args) {
		BigInteger bint1=new BigInteger("4");
		System.out.println(bint1.bitCount());//No. of 1 bit
		
		System.out.println(bint1.bitLength());//No. of total bits Allocated
		long val = 9223372036854775807L;//Max Value
		long val2 = 100;
		long res = val+val2;
		System.out.println(res);
		
		
		BigInteger in1 = new BigInteger("9223372036854775807");
		BigInteger in2 = new BigInteger("100");
		BigInteger res1 = in1.add(in2);
		System.out.println(res1);
		

	}

}
