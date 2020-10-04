package Assignment;

import java.util.Scanner;

public class CountMultipleOf3 {
static int divisibleBy3(int ar[],int n)
{
	int c=0;
	for(int i=0;i<n;i++)
	{
		if
		(ar[i]%3==0)
			c++;
		
	}
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		System.out.println(divisibleBy3(ar, n));

	}

}
