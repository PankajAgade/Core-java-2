package control_Statements_HW;

import java.util.Scanner;

public class Q_01_findGreater {

	public void input() 
	{
		int number1;
		int number2;
		int number3;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		number1 = kb.nextInt();
		
		System.out.print("Enter the second number : ");
		number2 = kb.nextInt();
		
		System.out.print("Enter the third number : ");
		number3 = kb.nextInt();
		
		findGreater(number1, number2, number3);
	}

	private void findGreater(int number1, int number2, int number3) 
	{
		System.out.println("first number : "+number1);
		System.out.println("second number : "+number2);
		System.out.println("third number : "+number3);
		
		if (number1 < number2 && number3 < number2)
		{
			System.out.println("Number2 is greater.");
		}
		else if (number1 < number3 && number2 < number3)
		{
			System.out.println("Number3 is greater.");
		}
		else if (number2 < number1 && number3 < number1)
		{
			System.out.println("Number1 is greater.");
		}
	}

}
