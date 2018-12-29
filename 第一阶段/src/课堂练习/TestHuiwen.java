package 课堂练习;

import java.util.Scanner;

public class TestHuiwen {

	public static void main(String[] args) {
//		2.	一个5位数,判断它是不是回文,即12321是回文,个位与万位相同,十位与千位相同
		
		System.out.println("请输入一行字符串:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		//将字符串转换为字符数组
		char array[]=str.toCharArray();
		boolean flag=true;//是回文
		for (int i = 0,j=array.length-1; i < array.length/2; i++,j--) {
			if(array[i]!=array[j]) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("是回文");
		}
		else {
			System.out.println("不是回文");
		}
	}

}
