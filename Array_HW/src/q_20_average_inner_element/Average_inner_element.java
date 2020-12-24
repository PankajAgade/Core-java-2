package q_20_average_inner_element;

public class Average_inner_element 
{
	int[][] arr = {{1,2,3},
			   {5,4,9},
			   {10,5,0}};
	
	void innerElement()
	{
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (i==0 || j==0 || i==arr.length-1 || j==arr.length-1)
				{
					continue;
				}
				else
				{
					sum = sum + arr[i][j];
					count++;	
				}
			}
			System.out.println();
		}
		
		System.out.println("Sum => "+sum);
		System.out.println("count => "+count);
		
		System.out.println("Average => "+(sum/count));
	}
}
