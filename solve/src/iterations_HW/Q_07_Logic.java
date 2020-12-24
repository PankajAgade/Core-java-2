package iterations_HW;

import java.util.Scanner;

public class Q_07_Logic 
{
	void input()
	{
		int start;
		int end;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of start : " );
		start = kb.nextInt();
		
		System.out.print("Enter the value of end   : " );
		end = kb.nextInt();
		
		evenOdd(start,end);
	}

	public void evenOdd(int start, int end)
	{
		for (int i = start; i <= end; i++)
		{
			if (i==2 || i==3 || i==5 || i==7)
			{
				System.out.println("=> "+i);
			}
			else
			{
				if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%9!=0 ) 
				{
					System.out.println("=> "+i);
				}
			}
		}
	}
}
