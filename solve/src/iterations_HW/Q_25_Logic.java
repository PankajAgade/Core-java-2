package iterations_HW;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class Q_25_Logic 
{
	public void print() 
	{
		for (int i = 1; i <= 13; i++) 
		{
			for (int j = 1; j <= 7; j++) 
			{
				if (i+j>=15 || i-j<0)//
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
