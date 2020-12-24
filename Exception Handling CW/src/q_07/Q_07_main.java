package q_07;

import java.util.Scanner;

public class Q_07_main 
{
	public static void main(String[] args) throws Exp 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Experience => ");
		int experience = kb.nextInt();
		
		if (experience < 5) 
		{
			throw new Exp("Not eligible experience for job");
		}
		else
		{
			System.out.println("Welcone as a employee");
		}
	}
}
