package control_Statements_CW;

import java.util.Scanner;

//Write a program to input a number from the user and display the corresponding day of the week.
public class Q_02 
{
	public static void main(String[] args) 
	{
		int input;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number 1 to 7 : ");
		input = kb.nextInt();
		
		Q_02_Weak obj = new Q_02_Weak();
		obj.weak(input);
		
	}
}
