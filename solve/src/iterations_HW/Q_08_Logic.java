package iterations_HW;

public class Q_08_Logic {
	
	public void logic() 
	{
		int r;
		int sum = 0;
		int temp = num;
		
		while (num>0)
		{
			r=num%10;
			
			sum(sum *10)+r;
			
			num = num / 10;
		}
		
		if (temp == sum)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}

}
