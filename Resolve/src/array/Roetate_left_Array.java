package array;

public class Roetate_left_Array 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Orignal Array => ");
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
		
		int first = arr[0];
		for (int i = 0; i < arr.length-1; i++) 
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		
		
		System.out.print("Rotated Array => ");
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
	}
}
