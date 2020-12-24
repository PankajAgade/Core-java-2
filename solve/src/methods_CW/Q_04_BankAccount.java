package methods_CW;

import java.util.Scanner;

public class Q_04_BankAccount 
{
	Scanner kb = new Scanner(System.in);
	int amount = 500;
	
	void deposit()
	{
		System.out.print("Enter the amount for deposit : ");
		int deposit_value = kb.nextInt();
		amount = amount + deposit_value;
		System.out.println("Total amount is => "+amount);
	}
	
	void withdraw()
	{
		System.out.print("Enter the amount for withdraw : ");
		int withdraw_value = kb.nextInt();
		amount = amount - withdraw_value;
		System.out.println("Total amount is => "+amount);
	}
	
	public void input() 
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~ Bank Account Management ~~~~~~~~~~~~~~~~~~~`");
		
		System.out.println("Now amount is => "+amount);
		System.out.println();
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.print("Select option : ");
		int key = kb.nextInt();
		action(key);
	}
	
	void action(int key)
	{
		switch (key) {
		case 1:
			deposit();
			break;

		case 2:
			withdraw();
			break;


		default:
			break;
		}
	}
}
