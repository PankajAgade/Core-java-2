package iterations_CW;

public class Q_04_Logic 
{
	int a = 1;
	public void print() 
	{
		for (int i = 1; i <= 9; i++) 
		{
			int b = a;
			for (int j = 1; j <= 5; j++) 
			{
				if (i<=5)
				{
					if (i+j>=7)//i+j>=7
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(b++);
					}
				}
				else
				{
					if (i-j<=3)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(b++);
					}
					
				}
			}
			System.out.println();
			if (i<=5)
			{
				a++;
				if (i==5) 
				{
					a=a-2;
				}
			} 
			else 
			{
				a--;
			}
		}
	}
}
