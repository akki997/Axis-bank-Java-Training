package Assignment;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int min=0,max=0,avg=0;
int n=s.nextInt();
int ar[]=new int[n];
for(int i=0;i<ar.length;i++)
{
	ar[i]=s.nextInt();
}
for(int i=0;i<ar.length;i++)
{
	min=Math.min(min, ar[i]);
	max=Math.max(max,ar[i]);
	avg=avg+ar[i];
}
System.out.println(min+" "+max+" "+avg/n);
	}

}
