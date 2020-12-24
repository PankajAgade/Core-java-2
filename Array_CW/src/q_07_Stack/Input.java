package q_07_Stack;

import java.util.Scanner;

public class Input 
{
	Scanner kb = new Scanner(System.in);
	
	void size()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of element Array : ");
		int size = kb.nextInt();
	}
	int[] input(int size)
	{		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) 
		{
			System.out.print("Enret the element arr["+i+"] : ");
			arr[i]=kb.nextInt();
		}
		
		System.out.println();
		System.out.println("Input array => ");
		
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
	
		
		return arr;
	}
}
