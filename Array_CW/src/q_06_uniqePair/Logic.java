package q_06_uniqePair;

public class Logic
{
	public int[] pair(int[] arr) 
	{
		
		int count = 0;
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}	
		
		System.out.println("Count => "+count);
		
		int[] uniq = new int[arr.length-count];
		
		int index=0;
		
		for (int i = 0; i < arr.length; i++)
		{
			boolean flag = true;
			for (int j = 0; j < uniq.length; j++)
			{
				if (arr[i]==uniq[j])
				{
					flag = false;
				}
			}
			if (flag) 
			{
				uniq[index++]=arr[i];
			}
		}
		
		return uniq;
	}
	
	void uniqPair(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.println("("+arr[i]+" , "+arr[j]+")  ");
			}
		}
	}
	
	void print(int[] arr)
	{
		for (int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
