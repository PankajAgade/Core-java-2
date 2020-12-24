package array;

public class Even_odd_seperate 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Orignal Array => ");
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		
		int ecount =0;
		int ocount = 0;
		
		
		for (int p : arr) 
		{
			if (p%2==0) 
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		
		System.out.println("E count => "+ecount);
		System.out.println("O count => "+ocount);
		
		int[] earr = new int[ecount];
		int[] oarr = new int[ocount];
		
		 ecount = 0;
		 ocount = 0;
		for(int p : arr)
		{
			if (p%2==0)
			{
				earr[ecount++]=p;
			}
			else
			{
				oarr[ocount++]=p;
			}
		}

		System.out.println();
		System.out.print("Even Array => ");
		for (int p : earr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		
		System.out.println();
		System.out.print("Odd  Array => ");
		for (int p : oarr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
	}
}
