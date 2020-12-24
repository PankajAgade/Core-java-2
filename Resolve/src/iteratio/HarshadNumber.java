package iteratio;
/*
Write a program to check whether a number is a Harshad Number or not.
In recreational mathematics, a harshad number in a given number base, 
is an integer that is divisible by the sum of its digits when written in that base.

Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) 
and 200 is divisible by 2. 
Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) 
and 171 is divisible by 9.
 */
public class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int num = 171;
		int num1=num;
		
		System.out.println("Number is : "+num);
		
		int sum = 0 ;
		
		while(num!=0)
		{
			sum = sum + (num%10);
			num = num / 10;
		}
		
		System.out.println("Sum = "+sum);
		
		if ((num1%sum)==0)
		{
			System.out.println(num1+" is a Harshad Number.");
		}
		else
		{
			System.out.println(num1+" is not Harshad Number.");
		}
		
		
	}
}
