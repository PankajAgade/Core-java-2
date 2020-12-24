package iterations_HW;

public class Q_14_Logic
{
	public void print() 
	{
		for (int i = 1; i <= 5; i++) 
		{
			int a = i;
			for (int j = 1; j <= 5; j++) 
			{
				if (i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a--);
				}
			}
			System.out.println();
		}
	}
}
