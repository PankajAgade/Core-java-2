package task1;

public class Anagram 
{
	static String[] arr1 = {"Pnakaj" , "Agade" , "abd" , "ac"};
	static String[] arr2 = {"Paaknj" , "Aeadg" , "bda"};
	
	static int arr1index=0;
	static int arr2index=0;
	
	public static void main(String[] args) 
	{
		sort(arr1,0,"sort");
	}

	private static void sort(String[] arr12, int i,String s) 
	{
		if(s.compareToIgnoreCase("sort")==0)
		{
			if (i<arr12.length)
			{
				
				sort(arr12, ++i,"Sort");
			}
		}
		if(s.compareToIgnoreCase("char")==0)
		{
			
		}
	}

	
	
}
