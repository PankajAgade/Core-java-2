package sarasrue;

public class next 
{
	public static void main(String[] args) 
	{
		String s ="bbbab";
		
		char[] arr = new char[256];
		
		for (int i = 0; i < s.length(); i++) 
		{
			arr[s.charAt(i)]++;
		}
		
		int max=0;
		int maxI = 0;
		for (int i = 0; i < arr.length; i++) 
		{	
			if (max<arr[i])
			{
				max = arr[i];
				maxI = i;
			}
		}
		
		char [] arr2 = new char[max];
		
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=((char)maxI);
		}
		
		String s2 = new String(arr2);
		
		System.out.println(s2);
		System.out.println(max);
	}
}
