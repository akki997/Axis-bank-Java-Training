package Assignment;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpecialSequence {
public static List sequence(int n)
{
	List<Integer>li=new ArrayList<Integer>();
	li.add(2);
	li.add(1);
	li.add(3);
	int k=0;
	while(li.get(li.size()-1)<=n)
	{
		int sum=0;
		for(int i=k;i<li.size();i++)
		{
			sum=sum+li.get(i);
		}
		li.add(sum);
		k++;
	}
	if(li.get(li.size()-1)>n)
		li.remove(li.size()-1);
	return li;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      System.out.println(sequence(x));
	}

}
