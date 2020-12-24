package q_35_Two_seeds;

public class Two_Seeds
{
	public static void main(String[] args) 
	{
		int[] arr = {20,10,0,20,0,10,0,20,0,10};
		int m = 20;
		int n = 10;
		
		Two_Seeds obj = new Two_Seeds();
		int diff = obj.FindMinDist(arr, arr.length, m, n);
		System.out.println("Diff => "+diff);
	}
	
	static int FindMinDist(int arr[],int arr_length,int m,int n)
	{
		int distance = Integer.MAX_VALUE;
		int dis;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (m==arr[i])
			{
				for (int j = 0; j < arr.length; j++) 
				{
					if (n==arr[j])
					{
						System.out.print(arr[i]+" "+arr[j]);
						
						if (i<j)
						{
							dis = j-i;
						}
						else
						{
							dis = i-j;
						}
						System.out.println("  /  Diff => "+dis);
						
						if (dis<distance)
						{
							distance = dis;
						}
					}
				}
			}
		}
		
		return distance;
	}
}