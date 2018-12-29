package com.hcl;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入整数");
		int a = sc.nextInt();
		System.out.println("输入单精度");
		float f = sc.nextFloat();
		System.out.println("输入双精度");
		double d = sc.nextDouble();
		System.out.println(a + f + d);
		sc.close();
	}

}
