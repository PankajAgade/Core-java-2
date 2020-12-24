package q_01;

public class Unique_Triplets 
{
	int[] arr = {1,5,-4,-2,-1};    //,9,8
	int input = 2;
	
	int count=0;
	public void logic() 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				for (int k = j+1; k < arr.length; k++) 
				{
					if (arr[i]+arr[j]+arr[k]==input) 
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
					}
					
				}
			}
		}
		
		System.out.println("count => "+count);
		
		
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
