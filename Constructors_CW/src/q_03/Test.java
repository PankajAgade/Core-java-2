package q_03;
/*
Create a class Test with constructors to initialize the variables and methods to perform the following tasks. 
Give appropriate arguments to methods. Methods should perform following programs:
	a. Even odd
	b. Factorial of a number using do-while loop. 
	c. Find sum of all digits of a number
 */
public class Test
{
	int number;

	public Test(int number) 
	{
		super();
		this.number = number;
	}
	
	void evenOdd()
	{
		if (number%2==0)
		{
			System.out.println("Given number is Even.");
		}
		else
		{
			System.out.println("Given number is Odd.");
		}
	}
	
	void factorial()
	{
		int fact = 1;
		
		for (int i = 1; i <= number; i++) 
		{
			fact = fact * i;
		}
		System.out.println("Factorial number is => "+fact);
	}
	
	void sumDigit()
	{
		int num = number;
		int sum = 0;
		while(num!=0)
		{
			sum = sum + (num%10);
			num = num / 10;
		}
		
		System.out.println("Sum of digit => "+sum);
	}
	
}
