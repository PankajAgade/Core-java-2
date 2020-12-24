package q_05;

public class Q_05
{
	public static void main(String[] args) 
	{
		try
		{
			sleep(1000);
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("In Final");
		}
	}
}
