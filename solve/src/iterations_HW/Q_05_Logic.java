package iterations_HW;

import java.util.Scanner;

public class Q_05_Logic 
{
	int input()
	{
		int num;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of number : " );
		return num = kb.nextInt();
		
	}

	public void countNumber(int num)
	{
		int count=0;
		while (num!=0)
		{
			num = num /10;
			
			count++;
		}
		System.out.println(count);
	}
}
