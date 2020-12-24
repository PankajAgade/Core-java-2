package control_Statements_HW;

import java.util.Scanner;

public class Q_11_LeapYear 
{
	int year;
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter something : ");
		year = kb.nextInt();
		checkLeapYear();
	}
	private void checkLeapYear()
	{
		if (year%4==0)
		{
			System.out.println("Entered year is Leap Year");
		}
		else
		{
			System.out.println("Entered year is not Leap Year");
		}
	}
}
