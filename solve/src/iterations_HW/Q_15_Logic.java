package iterations_HW;

public class Q_15_Logic 
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
					int a = ((i*(i-1))/2)+j;
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}
}
