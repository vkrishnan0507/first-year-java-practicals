package p1;

public class TwoDim 
{
	private int x,y;
	
	public TwoDim()
	{
		x=0;
		y=0;
	}
	
	public TwoDim(int a,int b)
	{
		x=a;
		y=b;
		
	}
	
 public String toString()
	{
		return String.format(x+","+y);
	}
 
 public void display()
 {
	 System.out.println(toString());
 }

}
