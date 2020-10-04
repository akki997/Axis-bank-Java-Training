package Assignment;

import java.util.Scanner;

public class FactorialOfEachDigit {
	static int fact(int n)
	{
		if (n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int x=s.nextInt();
while(x>0)
{
	int a=x%10;
	x=x/10;
	System.out.println(fact(a));
}
	}

}
