package claci.c;

public class Operate {
	public void compute(int a,int b,int type)
	{
		switch(type)
		{
		case 1:add(a,b);
			break;
		case 2:sub(a,b);
			break;
		case 3:mul(a,b);
			break;
		case 4:div(a,b);
			break;
		default:
			
		}
	}
	public void add(int a,int b)
	   {
		   System.out.println("Addition of "+a+" "+b+"\n"+(a+b));
	   }
	public void sub(int a,int b)
	   {
		   System.out.println("subtraction of "+a+" "+b+"\n"+(a-b));
	   }
	public void mul(int a,int b)
	   {
		   System.out.println("Multiplication of "+a+" "+b+"\n"+(a*b));
	   }
	public void div(int a,int b)
	   {
		   System.out.println("Division of"+a+" "+b+"\n"+(a/b));
	   }
}
