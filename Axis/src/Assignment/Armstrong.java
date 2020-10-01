package Assignment;

public class Armstrong {
	static String armstrong(int n)
	{
		int t=n;
		int sum=0;
		while(t>0)
		{
			int x=t%10;
			int r=x*x*x;
			sum=sum+r;
			 t=t/10;
		}
		if(sum==n)
			return "yes";
		else
			return "no";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(armstrong(153));
	}

}
