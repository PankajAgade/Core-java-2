package q_03_removeSpecific;

import java.util.Scanner;

public class Remove 
{
	int[] arr = {1,2,3,4,8,6,7};

	int[] arr2 = new int[arr.length-1];
	void remove()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the remove element : ");
		int element = kb.nextInt();
		
		int index =0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (element == arr[i])
			{
				continue;
			}
			else
			{
				arr2[index++]=arr[i];
			}
		}
	}
	
	void display()
	{
		System.out.print("Array => ");
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	void display2()
	{
		System.out.print("Array 2 => ");
		for (int p : arr2) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
}
