package oop_s_HW;

import java.util.Scanner;

public class Q_02_Oparetion 
{
	int number1,number2, result, option;
	Scanner kb = new Scanner(System.in);
	
	void input()
	{
		
		System.out.print("Enetr the First  number : ");
		number1 = kb.nextInt();
		
		System.out.print("Enetr the Second number : ");
		number2 = kb.nextInt();
	}

	void addition()
	{
		input();
		result = number1 + number2;
		System.out.println("Addition => "+result);
	}
	
	void subtraction()
	{
		input();
		result = number1 - number2;
		System.out.println("subtraction => "+result);
	}
	
	void multiplication()
	{
		input();
		result = number1 * number2;
		System.out.println("multiplication => "+result);
	}
	
	void option()
	{
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Quit");
		
		System.out.print("Enetr the Option : ");
		option = kb.nextInt();
		action();
	}
	
	void action()
	{
		switch (option) {
		case 1:
			addition();
			option();
			break;
			
		case 2:
			subtraction();
			option();
			break;
			
		case 3:
			multiplication();
			option();
			break;
			
		case 4:
			System.out.println("Bye Bye Boss");
			break;
			
		
			
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
