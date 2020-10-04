package Assignment;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0)
		{
			int x=n%10;
			if (x%2!=0)
			{
				sum=sum+x;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
