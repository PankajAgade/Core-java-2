package iteratio;

public class Pattern_01 
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 13; i++) 
		{
			for (int j = 1; j <= 7; j++) 
			{
				if (i+j<=14 && i-j>=0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
