package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParticipantId {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of partcipant");
         int n=s.nextInt();
         List<Integer>li=new ArrayList<Integer>();
         System.out.println("Enter the id");
         for(int i=0;i<n;i++)
         {
        	 li.add(s.nextInt());
         }
         System.out.println("Enter id to search");
         int id=s.nextInt();
         if(li.contains(id))
        	 System.out.println("Participant with id "+id+" exits");
         else
        	 System.out.println("Participant with id "+id+" does not exist");
	}

}
