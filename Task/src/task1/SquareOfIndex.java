package task1;

public class SquareOfIndex 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,3,1,2,0};
		
		String s = "";
		
		for (int i = 0; i < arr.length; i++) 
		{
			s = s+arr[arr[i]]*arr[arr[i]]+"*"; 			
		}
		
		int si = 0;
		int ei = 0;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)=='*')
			{
				ei = i;
				String s1 = s.substring(si, ei);
				arr[count++]=Integer.parseInt(s1);
				si = i + 1;
			}
		}
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
	}
}
