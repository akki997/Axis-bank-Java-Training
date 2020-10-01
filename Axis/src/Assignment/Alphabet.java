package Assignment;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
         char x=s.next().charAt(0);
         for(char i=x;i<='z';i++)
         {
        	 System.out.print(i+" ");
         }
	}

}
