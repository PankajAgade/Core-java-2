package iterations_HW;

import java.util.Scanner;

/*
 9*9 = 81 _ 8 + 1 = 9
 */
public class Q_21_Logic 
{
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = kb.nextInt();
		print(num);
	}

	private void print(int num) 
	{
		int temp = num;
		int sq = num * num;
		
		int sq1 = sq;
		
		int count =0;
		while (sq1!=0)
		{
			sq1=sq1/10;
			count++;
		}
		
		System.out.println("count => "+ count);
		
		if (count%2!=0)
		{
			System.out.println("Odd");
			count++;
		}
		
//		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~For first half digit~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		System.out.println();
		System.out.println("For first half digit");
		
		int first = sq;
		for (int i = 0; i < count/2; i++) 
		{
			first = first / 10 ;
			System.out.println("=> "+first);
		}
		
		System.out.println("final first => "+first);
		
		
//		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~For last half digit~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


		System.out.println();
		System.out.println("For last half digit");
		
//		int makeMod=1;
//		for (int i = 0; i < count/2; i++) 
//		{
//			makeMod = makeMod *10 ;
//		}
		
		int makeMod = (int) Math.pow(10, count/2);
		System.out.println("final makeMod => "+makeMod);
		
		int last = sq % makeMod;
		System.out.println("final last => "+last);
		
		int sum = first + last ;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Sum => "+sum);
		
		if (temp == sum) 
		{
			System.out.println("Given number is Kaprekar number");
		}
		else 
		{
			System.out.println("Given number is Not Kaprekar number");
		}
	}
}
