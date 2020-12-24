package q_03;

public class Split_array 
{	
	int[] arr = {5, 1, 3, 6, 8, 2, 9, 0, 10};    //Output: [1, 3, 6, 8, 9, 10] [5, 2, 0]
	int iSize;
	int dSize;
	
	public void logic() 
	{
		int incValue;
		int decValue;
		
		if (arr[0]<arr[1])
		{
			incValue = arr[0];
			decValue = arr[1];
		}
		else//arr[0]>arr[1]
		{
			incValue = arr[1];
			decValue = arr[0];
		}
		
		System.out.println("incValue => "+incValue);
		System.out.println("decValue => "+decValue);
		
		int incIndex = 1;
		int decIndex = 1;
		
		for (int i = 2; i < arr.length; i++) 
		{
			if (arr[i]>incValue)
			{
				incIndex++;
				
				incValue=arr[i];
			
			}
			else
			{
				
					decIndex++;
					
					decValue=arr[i];
					
				
			}	
		}
		
		
		System.out.println("inc index => "+incIndex);
		System.out.println("dec index => "+decIndex);
		iSize = incIndex;
		dSize = decIndex;
		
		int[] incArr = new int[iSize];
		int[] decArr = new int[dSize];	
		
		if (arr[0]<arr[1])
		{
			incArr[0] = arr[0];
			decArr[0] = arr[1];
			
			incValue = arr[0];
			decValue = arr[1];
		}
		else
		{
			incArr[0] = arr[1];
			decArr[0] = arr[0];
			
			 
		}

		incIndex = 1;
		decIndex = 1;
		
		for (int i = 2; i < arr.length; i++) 
		{
			if (arr[i]>incValue)
			{

				incArr[incIndex++] = arr[i];
				incValue=arr[i];
			
			}
			else
			{
				if (arr[i]<decValue) 
				{
					decArr[decIndex++] = arr[i];
					
					decValue=arr[i];
					
				}
			}	
		}
		
		
		
		System.out.print("inc Array => ");
		
		for (int p : incArr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("dec Array => ");
		for (int p : decArr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
	}


	public void display() 
	{
		System.out.print("Array => ");
		
		for (int p : arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println();
		
	}

}
