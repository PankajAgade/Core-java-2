package task1;

public class MergeAndSort 
{
	static int[] arr1 = {9,2,7,3,6,0,5};
	static int[] arr2 = {8,1,4};
	
	static int count1 = 0;
	static int count2 = 0;
	
	static int array = 0 ;
	static int index = 0;
	static int min = Integer.MAX_VALUE;
	
	static int insertfromEnd = 0;
	static int insertArr1 = 0;
	
	static int end = arr1.length;
	
	static int count = 0;
	public static void main(String[] args) 
	{
		travellAll(0);
		
		for (int p : arr1)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		for (int p : arr2)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
	}


	private static void travellAll(int i)
	{
		if (count<arr1.length)   //+arr2.length
		{
			min = Integer.MAX_VALUE;
			
			travellArr1(count1);
			
			//travellArr2(count2);
			System.out.println("min => "+min);
			swap();
			

			for (int p : arr1)
			{
				System.out.print(p+" ");
			}
			
			count++;
			travellAll(count);
		}
	}

	private static void travellArr1(int count1) 
	{
		if (count1<arr1.length)
		{
			System.out.println(min+" > "+arr1[count1]);
			if (min>arr1[count1])
			{
				min = arr1[count1];
				index = count1;
				array = 1;
			}
			count1++;
			travellArr1(count1);
		}
	}
	
	private static void travellArr2(int count2) 
	{
		if (count2<arr2.length)
		{
			if (min>arr2[count2])
			{
				min = arr2[count2];
				index = count1;
				array = 2;
			}
			count2++;
			travellArr2(count2);
		}
	}
	
	private static void swap() 
	{
		if (array==1)
		{
			System.out.println("Swap = "+index+" = "+arr1[insertArr1]+" "+arr1[index]);
			
			int temp = arr1[index];
			arr1[index] = arr1[insertArr1];
			arr1[insertArr1]=temp;
			count1++;
		} 
		else if(array==2)
		{
			int temp = arr2[insertArr1];
			arr2[insertArr1] = arr2[index];
			arr2[index]=temp;
			count1++;
		}
		
		if (insertfromEnd==2)
		{
			insertfromEnd=0;
		}
	}


}
