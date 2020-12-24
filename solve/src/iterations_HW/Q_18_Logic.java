package iterations_HW;

public class Q_18_Logic
{
	public void print() 
	{
		for (int i = 1; i <= 17; i=i+2) 
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i-j<0 || i+j>18)
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
