package q_18_even_odd;

public class Even_Odd_Logic 
{
	int[] arr = {1,2,3,4,3,8,2,6,7,2};
	int ecount=0;
	int ocount=0;

	void countEvenOdd()
	{
		int count = 0;
		int eindex = 0;
		int oindex = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) 
		{
			if (arr[i]%2!=0) 
			{
				oindex = i;
				for (int j = oindex; j > arr.length/2; j--)
				{
					if (arr[j]%2==0)
					{
						eindex = j;
					}
				}
				int temp = arr[oindex];
				 arr[oindex] =  arr[eindex];
				 arr[eindex] =  temp;
			}
			
		}

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
