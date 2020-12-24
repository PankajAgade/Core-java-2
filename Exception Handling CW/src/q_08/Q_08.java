package q_08;

public class Q_08 
{
	public static void main(String[] args) throws Expn 
	{
		int a = 5;
		int b = 0;
		int c ;
		
		try 
		{
			c=a/b;
		} 
		catch (ArithmeticException e)
		{
			throw new Expn("No divisible by Zero");
		}
		
	}
}
