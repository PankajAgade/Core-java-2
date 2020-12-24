package control_Statements_CW;

import java.util.Scanner;

//How to accept different types of data using Scanner class.
public class Q_01 
{
	public static void main(String[] args) 
	{
		int number;
		char alaphabet;
		String word;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		number = kb.nextInt();
		System.out.println();
		
		System.out.print("Enter the Alphabet : ");
		alaphabet = kb.next().charAt(0);
		System.out.println();
		
		System.out.print("Enter the String : ");
		word = kb.next();
		System.out.println();
		
		
	}
}
