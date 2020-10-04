package Assignment;

import java.util.Scanner;

public class CircleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner s=new Scanner(System.in);
               System.out.println("Enter the radius");
               float r=s.nextFloat();
               String out=s.next();
               double result=0;
               switch(out)
               {
               case "DIA":
            	   result=2*r;
            	   System.out.println("Diameter is "+result);
            	   break;
               case "AR":
            	   result=3.14*r*r;
            	   System.out.println("Area is "+result);
            	   break;
               case "PER":
            	   result=2*3.14*r;
            	   System.out.println("Perimeter is "+result);
            	   break;
               case "ARSEM":
            	   result=3.14*r;
            	   System.out.println("Area of semi circle is  "+result);
            	   break;
            	   
               }
               
	}

}
