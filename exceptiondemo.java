
class UnderAge extends Exception
{

int ag;	
	UnderAge(int a)
	{
		ag=a;
		
	}
	
	public String toString()
	{
		return "UnderAge :"+ag;
	}
	
}

public class exceptiondemo
{
	static void test(int age) throws UnderAge
	{
		if(age<18)
			throw new UnderAge(age);
		System.out.println("Not UnderAge");
	}
	
	public static void main(String args[])
	{
		try
		{
			test(18);
			test(10);
		}
		catch(UnderAge eg )
		{
			System.out.print(eg);
		}
	}
}
