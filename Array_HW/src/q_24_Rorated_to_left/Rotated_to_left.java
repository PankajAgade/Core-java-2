package q_24_Rorated_to_left;

public class Rotated_to_left 
{
	int[] arr = {1,2,3,4,3,8,2,6,7,2};
	
	void RotatedLeft()
	{
		int first = arr[0];

		for (int i = 0; i < arr.length-1; i++) 
		{
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = first;
	}

	
	void display()
	{
		System.out.print("Array  => ");
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
	}
}
