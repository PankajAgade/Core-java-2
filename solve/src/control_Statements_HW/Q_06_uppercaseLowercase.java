package control_Statements_HW;

import java.util.Scanner;

public class Q_06_uppercaseLowercase
{
	int ch;
	
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the charecter : ");
		ch = kb.next().charAt(0);
	}

	public void checkUppercaseLowercase() 
	{
		if (ch>='A' && ch<='Z')
		{
			System.out.println("Given chareacter is upper case");
		}
		else if(ch>='a' && ch<='z') 
		{
			System.out.println("Given chareacter is Lower case");
		}
	}
}
