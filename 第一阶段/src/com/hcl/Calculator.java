package com.hcl;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int a = sc.nextInt();
		System.out.println("���뵥����");
		float f = sc.nextFloat();
		System.out.println("����˫����");
		double d = sc.nextDouble();
		System.out.println(a + f + d);
		sc.close();
	}

}
