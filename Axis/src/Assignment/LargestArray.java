package Assignment;

import java.util.Scanner;

public class LargestArray {
static void largest(int ar1[],int ar2[],int n)
{
	int output[]=new int[n];
	for(int i=0;i<n;i++)
	{
		if(ar1[i]>ar2[i])
			output[i]=ar1[i];
		else
			output[i]=ar2[i];
	}
	for(int i=0;i<n;i++)
		System.out.println(output[i]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar1[]=new int[n];
		
		int ar2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			ar2[i]=s.nextInt();
		}
	}

}
