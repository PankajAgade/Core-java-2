package q_33;

public class Logic
{

	public void print(int[] arr) 
	{
		System.out.print("Even => 5");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Odd => ");
		for (int p : arr) 
		{
			if (p%2!=0) 
			{
				System.out.print(p+" ");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Positive => ");
		for (int p : arr) 
		{
			if (p>0) 
			{
				System.out.print(p+" ");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Negative => ");
		for (int p : arr) 
		{
			if (p<0) 
			{
				System.out.print(p+" ");
			}
		}
		System.out.println();
	}
	
}
