package patter;

public class Q_12 
{
	public static void main(String[] args) 
	{
		int a = 1;
		for(int i=1; i<=5 ; i++)
		{
			for(int j =1 ; j<=5 ; j++)
			{
				if(i-j>=0)
				{
					System.out.print(a+++" ");
				}
			}
			System.out.println();
		}
	}
}
