package q_04;

public class Q_04 
{
	public static void main(String[] args) 
	{
		String s1 = "Pankaj";
		String s2 = "Pankaj";
		
		int a = s1.compareToIgnoreCase(s2);
		
		if (a==0) 
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}
}
