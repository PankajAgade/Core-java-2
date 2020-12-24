package q_06_uniqePair;

import java.util.Scanner;

public class Input 
{
	int[] input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of element Matrix A : ");
		int size = kb.nextInt();
		
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
