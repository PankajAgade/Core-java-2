package task1;

public class revre 
{
	static String s = "asd$mkmvd&od##m"; // mdo$dvmkm&ds##a

	static char[] arr = s.toCharArray();
	static int start = 0;
	static int end = arr.length - 1;

	public static void main(String[] args) 
	{
		while (start<end)
		{
			boolean si = false;
			boolean ei = false;
			
			if ((arr[start]>='a' && arr[start]<='z') || (arr[start]>='A' && arr[start]<='Z')) 
			{
				si = true;
				if ((arr[end]>='a' && arr[end]<='z') || (arr[end]>='A' && arr[end]<='Z')) 
				{
					ei = true;
				}
				else
				{
					end--;
				}
			}
			else
			{
				start++;
			}
			
			
			if (ei&&si)
			{
				System.out.println("Start = "+start+"   end = "+end);
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println("end");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
		}
	}
}