package array;

public class Duplicate_Remove 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,8,0,4,1,2,6,9,8,4};
		
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
		System.out.print("Orignal Array => ");
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		System.out.println("Count => "+count);
		
		int[] arr2 = new int[arr.length-count];
		
		count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = true;
			for (int j = 0; j < arr2.length; j++)
			{
				if (arr[i]==arr2[j])
				{
					flag = false;
				}
			}
			if (flag)
			{
				arr2[count++]=arr[i];
			}
		}
		
		
		System.out.print("New   Array => ");
		for (int p : arr2) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
	}
}
