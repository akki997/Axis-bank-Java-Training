package Assignment;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the previous reading");
int p=s.nextInt();
System.out.println("Enter the current reading");
int c=s.nextInt();
int bill=Math.abs(c-p);
double total=0.0;


	
		if(bill<=30)
		{
			total=total+(bill*2.30);
		
			
		}
		else if (bill>30 && bill<=100)
		{
			total=total+(30*2.30)+((bill-30)*3.50);
		
		
		}
		else if (bill>100)
		{
			total=total+(30*2.30)+(70*3.50)+((bill-100)*4.60);
			
		}
		System.out.format("The bill amount is %.2f ",total);
	}
	




}
