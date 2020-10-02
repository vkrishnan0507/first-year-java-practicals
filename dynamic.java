package p;
import p1.*;
import p2.*;



public class dynamic 
{
	public static void main(String args[])
	{
		TwoDim a= new TwoDim(2,4);
		ThreeDim b=new ThreeDim(5,2,6);
		
		TwoDim test;
		test=a;
		test.display();
		
		test=b;
		test.display();
		
	}
}
