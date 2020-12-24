package q_22_Second_most_frequent;

import java.util.Scanner;

public class Second_most_frequent_logic
{
	String s = new String("aaaaaassssnnnioinn");
	
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your String => ");
		s = kb.next();
	}

	public void second_most_frequent() 
	{
		int[] arr = new int[256];
		
		for (int i = 0; i < s.length(); i++) 
		{
			arr[s.charAt(i)]++;
			System.out.println(arr[s.charAt(i)]);
			System.out.println();
		}
		
		int max = 0;
		int MaxI = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>1)
			{
				System.out.println(((char) i)+" => "+arr[i]);
				
				if (max<arr[i]) 
				{
					max = arr[i];
					MaxI=i;
				}
			}
		}
		
		System.out.println("Max => "+(char)MaxI+" = "+max);
		System.out.println("maxI => "+MaxI);
		
		
		
		int max2 = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>1)
			{
				System.out.println(((char) i)+" => "+arr[i]);
				
				if (max2<arr[i] && max!=arr[i]) 
				{
					max2 = arr[i];
					MaxI=i;
				}
			}
		}
		
		System.out.println("2nd Max => "+(char)MaxI+" = "+max2);
		System.out.println("maxI => "+MaxI);
	}	
}
