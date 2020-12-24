package array;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int n = 9;
		
		int min = 0;
		int max = arr.length-1;
		int mid ;
		
		while(min<max)
		{
			for (int i = 0; i < arr.length; i++) 
			{
				mid = (min + max)/2;
				
				if (arr[mid]==n) 
				{
					System.out.println("Element found.");
				}
				
				if (n>mid) 
				{
					min = mid + 1;
				}
				if (n<mid) 
				{
					max = mid - 1;
				}
			}
		}
		
	}
}
