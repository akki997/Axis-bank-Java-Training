package Assignment;

import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of dozens");
int x=s.nextInt();
System.out.println("Price per dozen");
int y=s.nextInt();
System.out.println("Selling price of 1 egg");
int z=s.nextInt();
int cp=y/12;
double gain=(z-cp);
double profit=(gain/cp)*100;
System.out.format("Profit percentage is %.2f",profit);
	}

}
