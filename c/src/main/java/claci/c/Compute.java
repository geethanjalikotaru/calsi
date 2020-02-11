package claci.c;
import java.util.*;
public class Compute{
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the computation to perform\n1.addition\n2.subtraction\n3.multiplication\n4.division");
    	int type=s.nextInt();
  	   	System.out.println("enter a,b values for addition");
  	   	int a=s.nextInt();
  	   	int b=s.nextInt();
  	   	Operate o=new Operate();
    	o.compute(a,b,type);
    }
}
