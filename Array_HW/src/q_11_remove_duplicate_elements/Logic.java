package q_11_remove_duplicate_elements;

public class Logic
{
	int[] arr = {1,0,3,97,3,8,2,6,7,2};


	void remove()
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j])
				{
					count++;
					break;			
				}
				
			}
		}
		
		
		System.out.println("Count => "+count);
		
		
		int[] arr2 = new int[arr.length-count];
		int index = 0;
		
		for (int i = 0; i < arr2.length; i++)
		{
			arr2[i]='a';
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = false;
			for (int j = 0; j < arr2.length; j++) 
			{
				if (arr[i]==arr2[j])
				{
					flag = true;
				}
			}
			if (!flag) 
			{
				arr2[index++] = arr[i];
			}
		}
		
		System.out.print("Array 2 => ");
		for (int i : arr2) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	
	void secondLast()
	{
		System.out.println("Second largest element is "+arr[arr.length-2]);
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
