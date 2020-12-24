package q_17_print_duplicates;

import java.util.Scanner;

public class Q_17_Duplicates_count 
{
	String s = new String();
	
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your String => ");
		s = kb.next();
	}

	public void printDuplicates() 
	{
		int[] arr = new int[256];
		
		for (int i = 0; i < s.length(); i++) 
		{
			arr[s.charAt(i)]++;
			System.out.println(arr[s.charAt(i)]);
			System.out.println();
		}
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>1)
			{
				System.out.println(((char) i)+" => "+(arr[i]-1));
			}
		}
	}
	
}
