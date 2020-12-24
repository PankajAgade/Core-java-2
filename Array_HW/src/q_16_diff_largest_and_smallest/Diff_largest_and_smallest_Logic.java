package q_16_diff_largest_and_smallest;

public class Diff_largest_and_smallest_Logic
{
	int[] arr1 = {1,2,3,4,3,8,2,6,7,2};
	
	void diff()
	{
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = i+1; j < arr1.length; j++) 
			{
				if (arr1[i]>arr1[j])
				{
					int temp = arr1[i];
					 arr1[i] =  arr1[j];
					 arr1[j] = temp;
				}
			}
		}
		
		System.out.println("Differance => "+(arr1[arr1.length-1]-arr1[0]));
	}

	
	void display()
	{
		System.out.print("Array  => ");
		for (int i : arr1) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
	}
}
