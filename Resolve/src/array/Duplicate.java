package array;

public class Duplicate 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,0,0,3,97,3,8,4,2,6,7,2};

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
		
		System.out.print("Array 1 => ");
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		System.out.println("Count => "+count);
		
		
		int[] arr1 = new int[arr.length-count];
		int index = 0;
		
		int[] arr2 = setNonContained(arr1,arr);
			
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

	private static int[] setNonContained(int[] arr1, int[] arr)
	{
		int[] q = new int[256];
		
		for (int i = 0; i < arr.length; i++) 
		{
			q[arr[i]]++;
		}
		
		System.out.print("Array 256 => ");
		for (int i : q) 
		{
			if (i>0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
		int uniq=0;
		for (int i=0 ; i<q.length;i++) 
		{
			if (q[i]==0)
			{
				uniq=i;
				break;
			}
		}
		
		System.out.println("uniq => "+uniq);
		
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=uniq;
		}
		
		System.out.println();
		
		return arr1;
	}
}
