package iterations_HW;
//Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
import java.util.Scanner;

public class Q_24_Logic
{

	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = kb.nextInt();
		check(num);
	}

	public void check(int num) 
	{
		int temp = num ;
		int sum = 0;
		while (num!=0)
		{
			sum =  sum + (num%10);
			num = num / 10;			
		}
		
		System.out.println("Sum => "+sum);
		
		if (temp%sum==0)
		{
			System.out.println("Number "+temp+" is a Harshad Number");
		} 
		else
		{
			System.out.println("Number "+temp+" is a Not Harshad Number");
		}
	}
	
}
