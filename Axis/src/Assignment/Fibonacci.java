package Assignment;

public class Fibonacci {

	static int fib(int n)
	{
		if(n<=1)
			return n;
		else 
			return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int N = 10; 
		  
	        // Print the first N numbers 
	        for (int i = 0; i < 10; i++) { 
	  
	            System.out.print(fib(i) + " ");
	}
	        //for odd number less than hundred
	        System.out.println();
	        for(int i=0;i<100;i++)
	        {
	        	if(i%2==1)
	        		System.out.print(fib(i)+" ");
	        }

}}
