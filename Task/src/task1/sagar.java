package task1;

import java.util.Scanner;

public class sagar 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int b = kb.nextInt();
		int k = kb.nextInt();
		
		int[] arr = new int[b];
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("=");
			arr[i]=kb.nextInt();
		}
		
		int ecount = 0;
		int ocount = 0;
		
		if (k%2==0)
		{
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i]%2==0)
				{
					ecount++;
				}
			}
			System.out.println(ecount);
			ocount = arr.length-ecount;
			int o = ocount/2;
			System.out.println("=> "+(ecount+o));
			
		}
		else
		{
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i]%2!=0)
				{
					//count++;
				}
			}
			int o = ocount/2;
			System.out.println("=> "+(o));
			
		}
	}
}
