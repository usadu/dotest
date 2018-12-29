package ¿ÎÌÃÁ·Ï°;

public class Hua {

	public static void main(String[] args) {
		int hua = 0;
		for(int i=1;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int n=0;n<=9;n++) {
					 hua=(int)(Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(n, 3));
					int result=Integer.parseInt(i+""+j+""+n);
					 if(result==hua) {
						 System.out.println(result);
						
					 }
				}
			}
		}
		
	}

}
