package task1;
// suppose there is a character array of a url. replace all spaces with '%20' and all '/' with '%2F'. display the output.  
public class URL 
{
	public static void main(String[] args) 
	{
		String s = "pankaj Agade/id"; // pankaj%20Agade%2Fid
		
		char[] arr = s.toCharArray();
		
		int spaceCount=0;
		int slashCount=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==' ')
			{
				spaceCount++;
			}
			if (arr[i]=='/')
			{
				slashCount++;
			}
		}	
		
		System.out.println("space => "+spaceCount);
		System.out.println("/ => "+slashCount);
		
		int size = arr.length+(2*(spaceCount+slashCount));
	
		char[] arr2 = new char[size];
		
		int index = 0;
		for (int i = 0; i < arr2.length; i++) 
		{
//			System.out.println("i = "+i);
//			System.out.println("in = "+index);
			if (arr[index]==' ')
			{
				arr2[i]='%';
				arr2[i+1]='2';
				arr2[i+2]='0';
				i=i+2;
				
			}
			else if (arr[index]=='/')
			{
				arr2[i]='%';
				arr2[i+1]='2';
				arr2[i+2]='F';
				i=i+2;
			}
			else
			{
				arr2[i]=arr[index];
			}
			index=index+1;
		}
		
		String s1 = new String(arr2);
		System.out.println("Orignal => "+s);
		System.out.println("URL => "+s1);
	}
}
