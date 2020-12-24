package q_29_N_distinct_integer_Sum;

public class N_distinct_integer_Sum 
{
	static int[] arr = {5,1,3,4,7};
	
	
	public static void main(String[] args) 
	{
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				
				for (int k = j+1; k < arr.length; k++) 
				{
					if (arr[i]!=arr[j] && arr[i]!=arr[k]) 
					{
						if ((arr[i]+arr[j]+arr[k])<12)
						{
							System.out.println("("+arr[i]+" , "+arr[j]+" , "+arr[k]+")");
							count++;
						}	
					}
				}
			}
		}
		
		System.out.println("Count => "+count);
	}
}
