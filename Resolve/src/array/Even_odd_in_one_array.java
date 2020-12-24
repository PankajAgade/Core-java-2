package array;

public class Even_odd_in_one_array
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Orignal Array => ");
		for(int p : arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
		
		int start = 0;
		int end = arr.length-1;
		
			for (int i = 0; i < arr.length/2; i++) 
			{
				if (arr[i]%2!=0) 
				{
					System.out.println(" o => "+arr[i]);
					
					for (int j = arr.length-1; j > arr.length/2; j--) 
					{
						if (arr[j]%2==0) 
						{
							System.out.println(" e => "+arr[j]);
							
						}end++;
					}
					
				}start++;
				
			}
			
			
		
		
		
	}
}
