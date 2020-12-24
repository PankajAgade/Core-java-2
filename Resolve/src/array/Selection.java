package array;

public class Selection 
{
	public static void main(String[] args) 
	{
		int[] arr = {6,4,6,5,8,5,4,3,6,4,1,5};
		
		for (int i = 0; i < arr.length; i++) 
		{
			int max = i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[j]<arr[max]) 
				{
					max = j;
				}
			}
			System.out.println("Max = "+arr[max]+" i = "+i);
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		
		System.out.println();
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
	}
}
