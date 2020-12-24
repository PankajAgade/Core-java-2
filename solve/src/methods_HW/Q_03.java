package methods_HW;

import java.util.Scanner;

/*
Write a progam to create Calculator class which have methods 
addition(int num1,int num2),
subtraction(int num1,intnum2), 
multiplication(int num1, int num2), 
division(int num1, int num2) with return type double. 
Create a menu driven program and do perform these operations of a calculator by creating an object of this class and execute 
these methods from main method of another class.
 */
public class Q_03 
{
	public static void main(String[] args) 
	{
		Q_03_Calculator obj = new Q_03_Calculator();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.print("Select option : ");
		int key = kb.nextInt();
		
		switch (key) 
		{
		case 1:
			double add =  obj.addition(10, 5);
			System.out.println("addition => "+add);
			break;

		case 2:
			System.out.println("Subtraction => "+obj.subtraction(10, 5));
			break;

		case 3:
			System.out.println("Multiplication => "+obj.multiplication(10, 5));
			break;

		case 4:
			System.out.println("Division => "+obj.division(10, 5));
			break;


		default:
			break;
		}
		
	}
}
