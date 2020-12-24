package q_06_second_largest;

public class Logic 
{
	int[] arr = {1,2,3,4,8,6,7};


	void sort()
	{
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
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
