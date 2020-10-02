import p1.*;
import p2.*;
import p3.*;
import java.io.*;

public class mainvaliclass 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader o1=new BufferedReader(new InputStreamReader(System.in));
		
		Circle C= new Circle("c1",4);
		Rectangle R= new Rectangle("r1",2,3);
		
		Shape S;
		
		System.out.print("Enter r1 for rectangle and c1 for circle");
		String s=o1.readLine();
		
		if(s.contentEquals("c1"))
		{
			S=C;
			System.out.println(S.toString());
		}
		else if(s.contentEquals("r1"))
		{
			S=R;
			System.out.println(S.toString());
			
		}
		else
		{
			System.out.print("Enter a valid code ");
		}
		
		
	}
}
