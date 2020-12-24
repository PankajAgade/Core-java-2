package iterations_CW;

import java.util.Scanner;

public class Q_02_power 
{
	int number;
	int power;
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = kb.nextInt();
		
		System.out.print("Enter the power : ");
		power = kb.nextInt();
	}
	
	public void print() 
	{
		int sum = 1;
		for (int i = 1; i <= power; i++)
		{
			sum = sum * number;
		}
		System.out.println("Result => "+sum);
	}
}