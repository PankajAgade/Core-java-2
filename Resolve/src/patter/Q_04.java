package patter;

public class Q_04 
{
	public static void main(String[] args) 
	{
		int a =1;
		for(int i = 1; i<=9 ; i++)
		{
			int b = a;
			for(int j =1; j<=5; j++)
			{
				if (i-j>=4 || i+j<=6)//
				{
					System.out.print(b++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			if (i<5)
			{
				a++;
			}
			else
			{
				a--;
			}
			System.out.println();
		}
	}
}
