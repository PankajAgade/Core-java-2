package q_05;

public class Q_05 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3};
		
		try
		{
			System.out.println(arr[10]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
