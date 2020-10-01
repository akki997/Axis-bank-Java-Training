package Assignment;

public class SumOfDigits {
	
	static int summ(int n)
	{
		int sum=0;
		while(n>0)
		{
			int x=n%10;
			n=n/10;
			sum=sum+x;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(summ(123));

	}

}
