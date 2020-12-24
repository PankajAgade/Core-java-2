package iterations_HW;

public class Q_19_Logic 
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
					if (j%2!=0) 
					{
						System.out.print("1");
					} 
					else 
					{
						System.out.print("0");
					}
				}
			}
			System.out.println();
		}
	}
}
