package iterations_HW;

public class Q_22_Logic
{
	public void print() 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(add(i,j));
				}
			}
			System.out.println();
		}
	}

	private int add(int i, int j)
	{
		if (j==1 || i==j)
		{
			return 1;
		}
		else
		{
		return(add(i-1, j-1) + add(i-1, j)); 
		}	
	}
}
