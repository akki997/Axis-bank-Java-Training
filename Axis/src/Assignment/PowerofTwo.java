package Assignment;

import java.util.Scanner;

public class PowerofTwo {
static String powerOfTwo(int n)
{
	if(n%2==0)
		return "yes";
	else
		return "no";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(powerOfTwo(n));
	}

}
