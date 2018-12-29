package com.hcl;

public class AA {
	 public static void main(String[] args) {
	  int m = 2;
	  int p = 1;
	  int i = 0;
	  for (; p < 5; p++) {
	   if (i++ > m) {
	    m = p + i;
	   }
	  }
	  System.out.println("i equals " + i);
	  System.out.println(p);
	 }
	}
