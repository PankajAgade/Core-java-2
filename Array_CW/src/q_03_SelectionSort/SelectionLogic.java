package q_03_SelectionSort;

public class SelectionLogic 
{
	int[] arr = {1,10,2,90,4,5};
	
	void selectionSort()
	{
		
		for (int i = 0; i < arr.length; i++)
		{
			int max = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[max]<arr[j])
				{
					max = j;
				}
			}
			int temp = arr[max];
			arr[max]=arr[i];
			arr[i]=temp;
		}
		
//		System.out.println("Sum => "+sum);
//		System.out.println("Average => "+(sum/arr.length));
	}
	
	void print()
	{
		for (int p : arr)
		{
			System.out.print(p+" ");
		}
		
	}
	
}
