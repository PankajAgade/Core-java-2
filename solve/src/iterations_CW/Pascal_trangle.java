package iterations_CW;

public class Pascal_trangle 
{
	public static void main(String[] args) 
	{
//		for (int k=1 ;k<=5; k++)
//		{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				if (j==1 || i==j) 
				{
					System.out.print(1);
				}
				else if(i-j==1)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
//		}
		}
	}
}
