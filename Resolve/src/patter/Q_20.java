package patter;

public class Q_20 
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(print(i,j));
			}
			System.out.println();
		}
	}

	private static int print(int i, int j)
	{
		if (i-j==0 || j==1)
		{
			return 1;
		}
		else
		{
			return print(i-1, j-1)+print(i-1, j);
		}
	}
}
