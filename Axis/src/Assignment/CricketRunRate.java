package Assignment;

import java.util.Scanner;

public class CricketRunRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int o,t;
       double result=0.00;
       double cr;
       System.out.println("Enter the number of overs bowled so far:");
       o=s.nextInt();
       System.out.println("Enter the current run rate");
       cr=s.nextDouble();
       System.out.println("Enter the target");
       t=s.nextInt();
      result=(t-(cr*o))/(50-o);
       System.out.format("Required run rate is %.2f", result);
	}

}
