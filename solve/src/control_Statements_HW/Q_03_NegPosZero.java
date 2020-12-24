package control_Statements_HW;

import java.util.Scanner;

public class Q_03_NegPosZero
{
	int number;
	
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = kb.nextInt();
	}

	public void checkEvenOdd() 
	{
		if (number==0) 
		{
			System.out.println("Given number is Zero");
		}
		else if(number>0)
		{
			System.out.println("Given number is Positive");
		}
		else
		{
			System.out.println("Given number is Negative");
		}
	}
}
