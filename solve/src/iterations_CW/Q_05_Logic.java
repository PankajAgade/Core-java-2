package iterations_CW;

public class Q_05_Logic 
{
	public void print() 
	{
		for (int i = 1; i <= 7; i++) 
		{
			char b = 'A';
			for (int j = 1; j <= 13; j++) 
			{
				if (j+i>=9 && j-i<=5) 
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print(b);
				}
				if (j<7)
				{
					b++;
				}
				else
				{
					b--;
				}
			}
			System.out.println();
		}
	}
}
