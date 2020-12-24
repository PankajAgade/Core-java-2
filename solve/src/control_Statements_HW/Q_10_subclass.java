package control_Statements_HW;

import java.util.Scanner;

public class Q_10_subclass 
{
	char num;
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter something : ");
		num = kb.next().charAt(0);
		checkWhatIs();
	}
	private void checkWhatIs()
	{
		if (num >='A' && num <='Z')
		{
			System.out.println("Given is upper case Alphabet");
		}
		else if (num >='a' && num <='z')
		{
			System.out.println("Given is lower case Alphabet");
		}
		else if (num >='0' && num <='9')
		{
			System.out.println("Given is Number");
		}
		else
		{
			System.out.println("Given is Special Charecter");
		}
	}
}