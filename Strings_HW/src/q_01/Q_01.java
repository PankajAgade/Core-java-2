package q_01;

public class Q_01 
{
	public static void main(String[] args) 
	{
		String s1 = "Pankaj";
		
		System.out.println("String => "+s1);
		System.out.println();
		
		char[] arr = s1.toCharArray();
		
		System.out.print(" Array => ");
		for (char c : arr) 
		{
			System.out.print(c);
		}
	}
}
