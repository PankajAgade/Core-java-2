package control_Statements_HW;

import java.util.Scanner;

public class Q_03_MinMax 
{
	int number1;
	int number2;
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		number1 = kb.nextInt();
		
		System.out.print("Enter the second number : ");
		number2 = kb.nextInt();
	}

	public void checkMinMax() 
	{
		if (number1>number2) 
		{
			System.out.println("Given number1 is greater");
		}
		else if(number1<number2)
		{
			System.out.println("Given number2 is greater");
		}
	}
}
