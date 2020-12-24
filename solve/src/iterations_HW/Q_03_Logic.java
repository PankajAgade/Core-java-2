package iterations_HW;

import java.util.Scanner;

public class Q_03_Logic {

	int input()
	{
		int num;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of number : " );
		return num = kb.nextInt();
		
	}
	public void checkPrimeOrNot(int num) 
	{
		boolean flag = false;
		for (int i = 2; i <= 9; i++) 
		{
			if(num==i)
			{
				continue;
			}
			else
			{
				if(i%num==0)
				{
					flag = true;
				}
			}
			
		}
		
		if (flag) 
		{
			System.out.println("Given Number is not Prime number");
		}
		else
		{
			System.out.println("Given Number is Prime number");
		}
	}

}
