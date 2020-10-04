package Assignment;

import java.util.Scanner;

public class DecimalConversion {

	public static int binaryToDecimal(int n)
	{
		int x=0;
		int k=0;
		while(n>0)
		{
			int a=n%10;
			x=(int) (x+(a*Math.pow(2, k++)));
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(binaryToDecimal(n));
	}

}
