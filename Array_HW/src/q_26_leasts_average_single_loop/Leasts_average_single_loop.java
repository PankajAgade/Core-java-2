package q_26_leasts_average_single_loop;

public class Leasts_average_single_loop 
{
	static int[] arr = {3,7,90,20,5,50,40};
	static int k = 3;
	public static void main(String[] args) 
	{
		
		
		 int minIndex = 0;
		 int minAvg = Integer.MAX_VALUE;
		 int sum = 0;
		for (int i = 0; i <= arr.length-k; i++) 
		{
			sum = giveSum(i,k);
			System.out.print("Sum => "+sum);
			
			System.out.println(" & Arg => "+sum/k);
			System.out.println();
			
			if ((sum/k)<minAvg) 
			{
				minAvg = sum/k;
				minIndex = i;
			}
		}
		
		System.out.println("Minimum Average = "+minAvg);
		System.out.println("Minimum Index   = "+minIndex);
		
	}

	private static int giveSum(int i, int k2)
	{
		if (k2 == 0)
		{
			return 0;
		}
		else
		{
			return arr[i]+giveSum(i+1, k2-1);
		}
	}
}
