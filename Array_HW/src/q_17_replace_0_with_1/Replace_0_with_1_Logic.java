package q_17_replace_0_with_1;

public class Replace_0_with_1_Logic 
{
	int[] arr1 = {0,1,0,1,0,1,0,1,0,1,0,1,0};
	
	void replace()
	{
		
		for (int i = 0; i < arr1.length; i++) 
		{
			if (arr1[i]==0)
			{
				arr1[i]=1;
			}
		}
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
