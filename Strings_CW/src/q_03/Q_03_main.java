package q_03;

public class Q_03_main 
{
	public static void main(String[] args) 
	{
		String s1 = "Pankaj";
		String s2 = "Pankaj";
		
		int a = s1.compareTo(s2);
		
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
