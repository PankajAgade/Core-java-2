package task1;

public class Q_01 
{
	static int[] arr = {10,0,-1,20,25,30};
	static int[] arr2 = new int[arr.length];
	static int sum=60;
	static int k = 1;
	static boolean flag = true;
	public static void main(String[] args) 
	{
//		int[] arr = {10,0,-1,20,25,30};
//		int[] arr2 = new int[arr.length];
//		int sum=45;
		
		while(flag)
		{
			for (int i = 0; i <= arr.length-k; i++) 
			{
				int zum = giveSum(i,k);
				System.out.print("zum => "+zum);
				
				System.out.println();
				
				for (int j = i; j < arr.length; j++) 
				{
					if ((zum+arr[j])==sum)
					{
						System.out.println("found"+" "+zum+" "+arr[j]);
						System.out.println("k = "+k);
						System.out.println("i => "+i);
						
						flag = false;
						break;
					}
				}
			}
			k++;
		}
	}
	private static int giveSum(int i, int k2)
	{
		if (k2 == 0)
		{
			return 0;
		}
		else
		{
			System.out.println(" => "+arr[i]+" "+giveSum(i+1, k2-1));
			return arr[i]+giveSum(i+1, k2-1);
		}
	}
}
