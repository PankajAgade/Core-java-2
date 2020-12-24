package q_05_ReverseArray;

public class Reverse_Array 
{
	int[] arr = {1,2,3,4,8,6,7};


	void reverse()
	{
		System.out.print("Array => ");
		for (int i = 0; i < arr.length/2; i++) 
		{
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
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
