package task1;

public class Rough2 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,6,5,5,9,8,4,5,9};
		int count = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		
		int[] arr1 = new int[arr.length-count];
		
		count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = false;
			for (int j = 0; j < arr1.length; j++) 
			{
				if (arr[i]==arr1[j])
				{
					flag = true;
				}
			}
			if (!flag) 
			{
				arr1[count++]=arr[i];
			}
		}
		
		for(int p : arr1)
		{
			System.out.print(p+" ");
		}
	}
}
