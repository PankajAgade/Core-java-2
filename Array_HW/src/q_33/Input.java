package q_33;

import java.util.Scanner;

public class Input
{
	int[] input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of element Array A : ");
		int size = kb.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) 
		{
			System.out.print("Enret the element arr["+i+"] : ");
			arr[i]=kb.nextInt();
		}
		

		System.out.println();
		System.out.print("Input array => ");
		
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
	
		
		return arr;
	}
}
