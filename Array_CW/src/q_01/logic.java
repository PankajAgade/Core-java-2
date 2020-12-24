package q_01;

public class logic 
{
	int[] arr = {1,2,3,4,5};
	
	void sumAvg()
	{
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum => "+sum);
		System.out.println("Average => "+(sum/arr.length));
	}
}
