package control_Statements_HW;

import java.util.Scanner;

public class Q_05_vowelConsonant 
{
	int ch;
	
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the charecter : ");
		ch = kb.next().charAt(0);
	}

	public void checkVowelConsonant() 
	{
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') //aeiou
		{
			System.out.println("Given chareacter is vowel");
		}
		else 
		{
			System.out.println("Given chareacter is Consonant");
		}
	}
}