package q_02;

public class Q_02 
{
	public static void main(String[] args) 
	{
		int a = 10 ;
		int b = 0 ;
		int c;
		
		try
		{
			c = a / b;
		} 
		finally 
		{
			System.out.println("Hi i am in final block");
		}
	}
}
