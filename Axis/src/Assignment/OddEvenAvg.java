package Assignment;

import java.util.Scanner;

public class OddEvenAvg {
public static float avgoddevenSum(int ar[],int n)
{
	int oddsum=0,evensum=0; float avg=0;
	for(int i=0;i<n;i++)
	{
		if(ar[i]%2==0)
			evensum=evensum+ar[i];
		else
			oddsum=oddsum+ar[i];
		
	}
	avg=(oddsum+evensum)/2;
	return avg;
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
System.out.println(avgoddevenSum(ar, n));
	}

}
