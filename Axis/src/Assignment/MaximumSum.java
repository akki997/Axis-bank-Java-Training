package Assignment;

import java.util.Scanner;

public class MaximumSum {

	public static int maximumSum(int ar[],int n)
	{
		int sumodd=0,sumeven=0,maxsum=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]%2==0)
				sumeven=sumeven+ar[i];
			else
				sumodd=sumodd+ar[i];
			
		}
		if(sumodd>sumeven)
			maxsum=sumodd;
		else
			maxsum=sumeven;
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int ar[]=new int[n];
         for(int i=0;i<n;i++ )
         {
        	 ar[i]=s.nextInt();
        	 
        	 
         }
         System.out.println(maximumSum(ar, n));
        		 
	}

}
