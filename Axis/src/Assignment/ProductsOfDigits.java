package Assignment;

import java.util.Scanner;

public class ProductsOfDigits {

	public static int productDigits(int n)
	{
		if(n<=0)
			return -1;
		
		else
		{
			int pr=1;
			while(n>0)
			{
				int x=n%10;
				 pr=pr*x;
				 n=n/10;
			}
			return pr;
		}
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       System.out.println(productDigits(n));
	}

}
