package array;

public class Leaders 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,5,5,90,4,60,10,6,9,4,5};
		
		System.out.println();
		System.out.print("Orignal Array => ");
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) 
		{
			 boolean flag = true;
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]<arr[j]) 
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				System.out.println("Leaders = "+arr[i]);
			}
		}
		
		
		
		
		
	}
}
