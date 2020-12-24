package q_12_evenOdd;

public class EvenOdd_Logic
{
	int[] arr = {1,2,3,4,3,8,2,6,7,2};
	int ecount=0;
	int ocount=0;

	void countEvenOdd()
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]%2==0) 
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		
		
		System.out.println("even Count => "+ecount);
		System.out.println("Odd  Count => "+ocount);
		
		int[] earr = new int[ecount];
		int[] oarr = new int[ocount];
		
		int eindex = 0;
		int oindex = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]%2==0)
			{
				earr[eindex++]=arr[i];
			} 
			else 
			{
				oarr[oindex++]=arr[i];
			}
		}
		
		
		
		System.out.print("Even Array => ");
		for (int i : earr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Odd  Array => ");
		for (int i : oarr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	
	void secondLast()
	{
		System.out.println("Second largest element is "+arr[arr.length-2]);
	}
	
	void display()
	{
		System.out.print("Array => ");
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
