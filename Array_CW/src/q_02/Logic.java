package q_02;

public class Logic 
{

	int[] arr = {1,2,3,4,5};
	
	void search()
	{
		int element = 5;
		
		int min = 0;
		int mid = arr.length/2;
		int max = arr.length-1;
		
		System.out.println("mid => "+mid);
		while (mid>min)
		{
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.println("In for loop");
				System.out.println("mid = "+arr[mid]);
				if (element==arr[mid])
				{
					System.out.println("Element found in index is "+mid);
					break;
				}
				if (element<mid)
				{
					max = mid - 1;
					System.out.println("max = "+max);
					mid = (max+min)/2;	
				}
				if(element>mid)
				{
					min = mid + 1;
					mid = (max+min)/2;	
				}
			}
		}
		
	}
}
