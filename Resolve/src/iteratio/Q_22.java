package iteratio;

public class Q_22 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(sum(i,j));
			}
			System.out.println();
		}
	}

	private static int sum(int i, int j) 
	{
		if (j==1 || i-j<=0)
		{
			return 1;
		}
		else
		{
			return sum(i-1, j-1)+sum(i-1, j);
		}
	}
}
