package arithmetic_main;

import arithmetic.Addition;
import arithmetic.Division;
import arithmetic.Multiplication;
import arithmetic.Subtraction;

public class Main 
{
	public static void main(String[] args) 
	{
		Addition obj1 = new Addition();
		System.out.println(obj1.add(5, 10));
		
		Subtraction obj2 = new Subtraction();
		System.out.println(obj2.sub(10, 5));
		
		Division obj3 = new Division();
		System.out.println(obj3.div(10, 2));
		
		Multiplication obj4 = new Multiplication();
		System.out.println(obj4.mul(5, 10));
		
	}
}
