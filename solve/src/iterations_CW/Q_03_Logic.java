package iterations_CW;

public class Q_03_Logic
{

	public void print() 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i+j>=7)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
