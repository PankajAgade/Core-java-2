package q_04;

public class Q_04 
{
	public static void main(String[] args) 
	{
		int a =5;
		int b = 0;
		int c;
		
		try 
		{
			c = a / b;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("I am in final.");
		}
		
	}
}
