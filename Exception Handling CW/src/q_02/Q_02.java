package q_02;

import java.util.Scanner;

public class Q_02 
{
	static int a = 5;
	static int b;
	static int c;
	
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the vlaue : ");
		b = kb.nextInt();
		
		try
		{
			A();
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

	private static void A() 
	{
		System.out.println("Start form A");
		B();
		c = a / b;
		System.out.println("End form A");
	}
	
	private static void B() 
	{
		System.out.println("Start form B");
		C();
		System.out.println("End form B");
	}
	
	private static void C() 
	{
		System.out.println("Start form C");
		D();
		System.out.println("End form C");
	}
	
	private static void D() 
	{
		System.out.println("Start form D");
		
		System.out.println("End form D");
	}
	
	
	
}
