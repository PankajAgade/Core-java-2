package q_02;

import java.util.Scanner;

public class Found 
{
	int[] arr = {1,2,3,4,8,6,7};
	
	void find()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the element : ");
		int element = kb.nextInt();
		
		boolean flag = false;
		int index =0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (element == arr[i])
			{
				index = i;
				flag = true;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Element found in index is => "+index);
		}
		else
		{
			System.out.println("Element not found");
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
}
