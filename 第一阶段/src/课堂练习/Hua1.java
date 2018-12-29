package ¿ÎÌÃÁ·Ï°;

public class Hua1 {

	public static void main(String[] args) {
		for(int i=100;i<10000;i++) {
			int a = i%10;
			int b = i/10%10;
			int c = i/100%10;
			int result=a*a*a+b*b*b+c*c*c;
			if(result==i) {
				System.out.println(result);
			}
		}
	}

}
