package task1;

public class rough 
{
	static int[] arr = {8,9,5,3,3,9,1,2,6,0};
	static int[] ar = {3,1,8,1,6,5,1,3,8,1,8,6,2,0};
	
	static int min;
	static int mini = 0;
	
	public static void main(String[] args) 
	{
		
		sort(ar,0,"sort");
			
		sort(arr,0,"sort");
		
		System.out.println();
		for(int p : arr)
		{
			System.out.print(p+" ");
		}
		
		System.out.println();
		for(int p : ar)
		{
			System.out.print(p+" ");
		}
	}
	
	private static void sort(int[] arr2, int i, String s) 
	{
		if(s.compareToIgnoreCase("sort")==0)
		{
			if (i==0)
			{
				min = Integer.MAX_VALUE;
				mini = 0;	
			}
			if (i<arr2.length)
			{
				System.out.println();
				System.out.println(arr2[i]+"=");
				
				min = Integer.MAX_VALUE;
				sort(arr2,i,"min");
				System.out.println("min ="+min+" mini ="+mini+" i="+i);
				
				int temp = arr2[i];
				arr2[i]=arr2[mini];
				arr2[mini] = temp;
			
				sort(arr2, ++i,"sort");
			}
		}
		if(s.compareToIgnoreCase("min")==0)
		{
			if (i<arr2.length)
			{
				if(min>arr2[i])
				{
					min = arr2[i];
					mini = i;
				}
				sort(arr2, ++i,"min");
			}
		}
	}
	
	
	
	
}
