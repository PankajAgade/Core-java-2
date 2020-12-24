package array;

public class Average_of_inner_element 
{
	public static void main(String[] args) 
	{
		int [][]arr = {{1,2,3,4},{4,5,6,2},{2,6,9,4},{2,3,6,5}};
		
		System.out.println("Origal array => ");
		for(int[] q : arr)
		{
			for(int p : q)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (i==0 || j==0 || i==arr.length-1 || j==arr.length-1) 
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(arr[i][j]+" ");
					sum = sum + arr[i][j];
					count++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Sum => "+sum);
		System.out.println("Avg => "+(sum/count));
	}
}
