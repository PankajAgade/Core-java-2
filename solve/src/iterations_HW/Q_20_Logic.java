package iterations_HW;
/*
1
2 1 2
3 2 1 2 3
4 3 2 1 2 3 4
 */
public class Q_20_Logic
{
	public void print() 
	{
		int a = 1;
		for (int i = 1; i <= 7; i=i+2) 
		{
			int b = a;
			for (int j = 1; j <= 7; j++) 
			{
				if (i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(b);
					if (j<((j/2)+1))
					{
						b++;
					}
					else
					{
						b--;
					}
				}
			}
			System.out.println();
			a++;
		}
	}
}
