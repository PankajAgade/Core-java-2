package q_30_StringBuffer_objects;

public class Main
{
	public static void main(String[] args) 
	{
		StringBuffer_objects obj = new StringBuffer_objects();
		
		obj.sb_objects();
		
		System.out.print("String => ");
		for (StringBuffer arr : obj.sbA)
		{
			System.out.print(arr+" ");
		}
		System.out.println();
		
		obj.Sort_ascending();
		
		obj.Palindrome();
		
		
	}
}
