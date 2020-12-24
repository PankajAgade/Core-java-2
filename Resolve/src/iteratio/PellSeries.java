package iteratio;
/*
Write a program to print the first 15 numbers of the Pell series. 
In mathematics, the Pell numbers are an infinite sequence of integers. 
The sequence of Pell numbers startswith 0 and 1, and then each Pell number is 
the sum of twice the previous Pell number and the Pell number before that.: 
The first few terms of the
sequence are : 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,… (Feb Monthly).
 */
public class PellSeries 
{
	public static void main(String[] args) 
	{
		int first = 0;
		int second = 1;
		
		System.out.println();
		System.out.print("pell number => "+first+" ");
		System.out.print(second+" ");
		
		int sum = 0;
		for (int i = 1; i <= 13; i++) 
		{
			sum = second + second + first;
			System.out.print(sum+" ");
			first = second;
			second = sum;
		}
	}
}
