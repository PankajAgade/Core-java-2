package q_14_Test_equal_array;

public class Test_equal_array
{
	int[] arr1 = {1,2,3,4,3,8,2,6,7,2};
	int[] arr2 = {1,2,3,4,3,8,2,6,7,2};
	

	void checkEquality()
	{
		boolean flag = true;
		if (arr1.length == arr2.length)
		{
			for (int i = 0; i < arr1.length; i++) 
			{
				if (arr1[i]!=arr2[i])
				{
					flag = false;
					break;
				}
			}
		} 
		else 
		{
			System.out.println("Two array length not equal.");
		}	
		
		if (!flag)
		{
			System.out.println("Two array elements not equal.");
		} 
		else 
		{
			System.out.println("Two array elements are equals.");
		}
	}

	
	void display()
	{
		System.out.print("Array 1 => ");
		for (int i : arr1) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.print("Array 2 => ");
		for (int i : arr2) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
	}
	
}
