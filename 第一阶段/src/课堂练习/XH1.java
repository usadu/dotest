package ¿ÎÌÃÁ·Ï°;

public class XH1 {
	
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 1;
		
		for (int j = 1; j <= 7; j++) {
			sum1 *= j;
			sum += sum1;
		}
		

		System.out.println(sum);

	}

}
