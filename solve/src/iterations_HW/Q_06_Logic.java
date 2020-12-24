package iterations_HW;

import java.util.Scanner;

public class Q_06_Logic
{
	int input()
	{
		int num;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of number : " );
		return num = kb.nextInt();
		
	}

	public void sumNumber(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int temp = num;
			sum = sum + (temp%10);
			num = num / 10;		
		}
		System.out.println("Sum => "+sum);
	}
}
