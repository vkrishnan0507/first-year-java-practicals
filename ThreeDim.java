package p2;
import p1.TwoDim;

public class ThreeDim extends TwoDim 
{
	private int z;
	
	public ThreeDim()
	{
		super();
		z=0;
	}
	
	public ThreeDim(int a,int b,int c)
	{
		super(a,b);
		z=c;
	}
	
	public String toString()
	{
		return String.format(super.toString()+","+z);
		
		
		
	}
	
	public void display()
	 {
		 System.out.println(toString());
	 }
	
	
	
}
