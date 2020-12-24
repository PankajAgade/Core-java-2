package q_10;

public class Q_10 
{
	public static void main(String[] args) 
	{
		String s = "Pankaj";
		
		char[] ch = s.toCharArray();
		
		System.out.println("String => "+s);
		
		System.out.print("Array => ");
		
		for (char c : ch) 
		{
			System.out.print(c);
		}
	}
}
