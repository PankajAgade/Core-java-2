package task1;

public class ReverseCharacter 
{
	static String s = "asd$mkmvd&od##m";				 // mdo$dvmkm&ds##a
	
	static char[] arr = s.toCharArray();
	static int start = 0;
	static int end =arr.length-1; 
	
	public static void main(String[] args) 
	{

		for (int i = 0; i < arr.length/2; i++) 
		{
			boolean f1 = false;
			boolean f2 = false;
			
		//	System.out.println("Start => " + searchfromstart(i) + " " + start);
			System.out.println("End => " + searchfromend(arr.length-i-1) + " " + end);
			
			if (searchfromstart(i)&&searchfromend(arr.length-i-1))
			{
				System.out.println(arr[start]+"==="+arr[end]);
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}

		}
		for (char c : arr)
		{
			System.out.print(c);
		}
	}

	private static boolean searchfromend(int i) 
	{
		boolean v = false;
		if (start<end)
		{
			if ((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z')) 
			{
				end = i;
				v = true;
			}
			else
			{
				int k = i-1;
				searchfromend(k); 
			}
		}
		else
		{
			return false;
		}
		
		if (v) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static boolean searchfromstart(int i) 
	{
		boolean found = false;
		if(start<end)
		{
			if ((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z')) 
			{
				start = i;
				found = true;
			}
			else
			{
				searchfromend(i++); 
			}
		}
		else
		{
			return false;
		}
		if (found) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
