package Assignment;

import java.util.Scanner;

public class ClassRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner (System.in);
         int ar[]=new int[3];
         for(int i=0;i<ar.length;i++)
         {
        	 System.out.println("Enter capacity for class "+(i+1));
        	 
        	 ar[i]=s.nextInt();
         }
         System.out.println("Enter the number of student");
         int n=s.nextInt();
         int c=0;
         for(int i=0;i<ar.length;i++)
         {
        	 if(n<=ar[i])
        		 c++;
         }
         if(c==0)
        	 System.out.println("None of lab can accomodate "+n+" students");
         else
        	 System.out.println(c+" labs can accomodate "+n+" students");
         
	}

}
