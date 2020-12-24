package q_03;

public class Q_03 
{
	public static void main(String[] args) 
	{
		int a = 10 ;
		int b = 0 ;
		int c;
		
		try
		{
			c = a/b ;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		}
	}
}
