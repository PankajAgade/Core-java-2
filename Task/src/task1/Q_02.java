package task1;

public class Q_02 
{
	static int[] arr = {10,0,-1,20,25,30};
	static int[] arr2 = new int[arr.length];
	static int sum=60;
	static int k = 1;
	static boolean flag = true;
	
	public static void main(String[] args) 
	{
		System.out.print("Orignal Array => ");
		for (int p : arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				int left = j;
				int right= arr.length-1;
			}
		}
	}
	
	
}
