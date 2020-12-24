package control_Statements_HW;

import java.util.Scanner;

public class Q_07_Trangle
{
	int side1;
	int side2;
	int side3;
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first side : ");
		side1 = kb.nextInt();
		
		System.out.print("Enter the second side : ");
		side2 = kb.nextInt();
		
		System.out.print("Enter the third side : ");
		side3 = kb.nextInt();
	}

	public void checkTrangle() 
	{
		if (side1==side2 && side1==side3) 
		{
			System.out.println("Given Trangle is equilateral trangle");
		}
		else if(side1==side2 || side1==side3 || side2==side3)
		{
			System.out.println("Given Trangle is isosceles trangle");
		}
		else
		{	
			System.out.println("Given Trangle is scalene trangle");
		}
	}
}
