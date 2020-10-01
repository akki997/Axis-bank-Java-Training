package Assignment;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
            	if(i%2==0)
            		System.out.print("*");
            	else
            		System.out.print("#");
            }
            System.out.println();
        }
	}

}
