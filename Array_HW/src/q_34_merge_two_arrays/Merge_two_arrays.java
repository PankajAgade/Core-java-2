package q_34_merge_two_arrays;

public class Merge_two_arrays
{
	int[] arr1 = {1,2,3,4,5};
	int[] arr2 = {6,7,8,9,10};
	int[] arr3 = new int[arr1.length+arr2.length];
	
	void merge()
	{
		int a=0;
		int b=0;
		for (int i = 0; i < arr3.length; i++) 
		{
			if (a<=arr1.length-1) 
			{
				arr3[i]=arr1[a++];
			}
			else
			{
				arr3[i]=arr2[b++];
			}
		}
		
		
		for (int p : arr3) 
		{
			System.out.print(p+" ");
		}
	}
	
}
