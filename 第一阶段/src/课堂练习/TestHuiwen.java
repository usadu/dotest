package ������ϰ;

import java.util.Scanner;

public class TestHuiwen {

	public static void main(String[] args) {
//		2.	һ��5λ��,�ж����ǲ��ǻ���,��12321�ǻ���,��λ����λ��ͬ,ʮλ��ǧλ��ͬ
		
		System.out.println("������һ���ַ���:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		//���ַ���ת��Ϊ�ַ�����
		char array[]=str.toCharArray();
		boolean flag=true;//�ǻ���
		for (int i = 0,j=array.length-1; i < array.length/2; i++,j--) {
			if(array[i]!=array[j]) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("�ǻ���");
		}
		else {
			System.out.println("���ǻ���");
		}
	}

}
