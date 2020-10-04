package Assignment;

import java.util.Scanner;

public class Passcount {
static int passCount(int ar[],int n)
{
	int c=0;
	for(int i=0;i<n;i++)
	{
		if(i%2!=0)
		{
			if(ar[i]>=70)
				c++;
		}
	}
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println(passCount(ar, n));
	}

}
