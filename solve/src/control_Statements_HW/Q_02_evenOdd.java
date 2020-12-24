package control_Statements_HW;

import java.util.Scanner;

public class Q_02_evenOdd 
{

	int number;
	
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = kb.nextInt();
	}

	public boolean checkEvenOdd() 
	{
		if (number%2==0) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
