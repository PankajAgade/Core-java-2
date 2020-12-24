package q_07;

public class Q_07 
{
	public static void main(String[] args) 
	{
		String s1 = "Pankaj";
		
		StringBuffer s2 = new StringBuffer("Pankaj");
		String s3 = new String(s2);
		
		System.out.println(s1.compareTo(s3));
		
		
	}
}
