package q_08;

public class ThrowsDemo 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		
		int result = 0;
		try
		{
			result=obj.division(5, 0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divisor cannot be zero");
		}
		finally 
		{
			System.out.println("The result is : "+result);
		}
	}
}
