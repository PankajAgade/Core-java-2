package task1;

public class IndexWala 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,3,1,2,0};  //0 4 9 1 16
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (max < arr[i]) 
			{
				max = arr[i];
			}
		}
		max=max*max;
		int count = 0;
		while(max!=0)
		{
			max=max/10;
			count++;
		}
		max = 1;
		for (int i = 0; i < count; i++) 
		{
			max = max * 10;
		}
		System.out.println("Max = "+max);
		
		for (int i = 0; i < arr.length; i++) 
		{
			int temp = 0;
			if(arr[i]<max)
			{
				System.out.println("1");
				temp = arr[arr[i]];
			}
			else
			{
				System.out.println("2");
				temp = arr[arr[i]]%max;
			}
			
			int n = temp*temp;
			arr[i]=((n*max)+arr[i]);
			System.out.println("(n*max)+arr[i] => "+"("+n+"*"+max+")+"+arr[i]+" === "+((n*max)+arr[i])+" = "+(((n*max)+arr[i]))/max);
			
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			//System.out.println("old = "+arr[i]%max);
			//System.out.println("New = "+arr[i]/max);
		}
		
		
		
	}
}
