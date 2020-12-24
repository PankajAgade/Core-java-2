package q_01;

import java.util.Scanner;

public class Q_01 
{

	static int a = 10;
	static int b;
	static int c;
	public static void main(String[] args) 
	{	
		Scanner kb = new Scanner(System.in);
		System.out.print("enter : ");
		b = kb.nextInt();
		
		try
		{
			a();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	static void a()
	{
		System.out.println("Start from A");
		b();
		System.out.println("End to A");
	}
	
	static void b()
	{
		System.out.println("Start from B");
		
		c();
		c = a/b;
		System.out.println("End to B");
	}
	static void c()
	{
		System.out.println("Start from C");
		d();
		System.out.println("End to C");
	}
	static void d()
	{
		System.out.println("Start from D");
		
		System.out.println("End to D");
	}
}