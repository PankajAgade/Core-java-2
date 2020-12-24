package q_04_copy;

import java.util.Scanner;

public class CopyArray
{
	int[] arr = {1,2,3,4,8,6,7};

	int[] arr2 = new int[arr.length];
	void copy()
	{
		for (int i = 0; i < arr.length; i++) 
		{
			arr2[i]=arr[i];
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
