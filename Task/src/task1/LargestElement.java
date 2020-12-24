package task1;

public class LargestElement 
{
	static int[] arr1 = {1,28,89,4,6,8,43,4};
	static int[] arr2 = {56,5,3,4,16,83,4,6,88,4};
	static int max1 = Integer.MIN_VALUE;
	static int max2 = Integer.MIN_VALUE;
	
	public static void main(String[] args) 
	{
		
		findMaxArr1(0);
		findMaxArr2(0);
		
		
		System.out.println("Max1 => "+max1);
		System.out.println("Max1 => "+max2);
		
		if (max1>max2)
		{
			System.out.println("Maximum element =====> "+max1);
		}
		else
		{
			System.out.println("Maximum element =====> "+max2);
		}
		
	}

	private static void findMaxArr1(int i)
	{
		if (i<arr1.length) 
		{
			if (max1<arr1[i])
			{
				max1=arr1[i];
			}
			int k = i + 1;
			findMaxArr1(k);
		}
		else
		{
			System.out.println("end");
		}
	}
	
	private static void findMaxArr2(int i)
	{
		if (i<arr2.length) 
		{
			if (max2<arr2[i])
			{
				max2=arr2[i];
			}
			int k = i + 1;
			findMaxArr2(k);
		}
		else
		{
			System.out.println("end");
		}
	}
	
}
