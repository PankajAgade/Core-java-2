package sarasrue;

public class pattern 
{
	public static void main(String[] args) 
	{
		for (int i = 3; i >= 1; i--) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (j-i<=2 && i+j>=4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}
