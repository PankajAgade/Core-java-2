package patter;

public class M 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 7; i++) 
		{
			for (int j = 1; j <= 7; j++) 
			{
				if (((i-j==0 || i+j==8) && i<=4) || (j==1 || j==7))
				{
					System.out.print("*");
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
