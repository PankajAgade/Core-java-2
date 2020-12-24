package patter;

public class Q_05 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=7;i++)
		{
			char ch = 'A';
			for(int j=1 ; j<=13 ; j++)
			{
				if(j-i>=6 || i+j<=8)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
				if (j<=6)
				{
					ch++;
				}
				else
				{
					ch--;
				}
			}
			System.out.println();
		}
	}
}
