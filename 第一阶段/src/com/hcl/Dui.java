package com.hcl;

public class Dui {

	public static void main(String[] args) {
		String c = new String("最最");
		String a = "最最";
		String b = "最最";
		String d = new String("最最");

		System.out.println((a == b));
		System.out.println((a == c));
		System.out.println((c == b));
		System.out.println((c == d));
		System.out.println(b.equals(d));
		System.out.println(a+b);
		
		
	
		

	}
}
