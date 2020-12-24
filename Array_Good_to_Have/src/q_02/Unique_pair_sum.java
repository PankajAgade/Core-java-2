package q_02;

public class Unique_pair_sum 
{
	int[] arr = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};    	
	int input = 7;
	
	public void logic() 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]!=arr[j]) 
				{
					if ((arr[i]+arr[j])==7) 
					{
						System.out.println("("+arr[i]+" , "+arr[j]+")");
					}
				}
				
			}
		}
		
		
	}


	public void display() 
	{
		System.out.print("Array => ");
		
		for (int p : arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
		
	}

}
