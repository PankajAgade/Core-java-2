package q_28_delete_all_extra_blank;

public class Delete_all_extra_blank_Logic 
{
	
	String s = "      malcv   kvnkan  ovnak         ka       m   ";

	public void delete_all_extra_blank()
	{
		String s1 = s.trim();
		char[] arr = s1.toCharArray();
		System.out.println("String 1 => "+s1);
		
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) 
		{
			if (arr[i]==' ' && arr[i+1]==' ' )
			{
				count++;
			}
		}
		
		System.out.println("Count => "+count);
		
		char[] arr2 = new char[arr.length-count];
		
		System.out.println("Length => "+arr2.length);
		
		
		
		count =0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==' ' && arr[i+1]==' ' )
			{
				continue;
			}
			else
			{
				arr2[count++]=arr[i];
			}
		}
		
		System.out.println();
		
		String ns = new String(arr2);
		
		System.out.println("removed space String => "+ns);
	
	
	}
}
