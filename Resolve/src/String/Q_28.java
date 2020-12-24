package String;

public class Q_28 
{
	public static void main(String[] args) 
	{
		String s = "   ivjjnocinij  j in j in j o inn non     jv no n  in  n       ";
		System.out.println("Orignal String => "+s);
		s=s.trim();
		System.out.println("After trim String => "+s);
		System.out.println();
		
		char[] sa = s.toCharArray();
		int count = 0;
		for (int i = 0; i < sa.length; i++) 
		{
			if (sa[i]==' ' && sa[i+1]==' ') 
			{
				count++;
			}
		}
		System.out.println("Count => "+count);
		
		char[] nsa = new char[sa.length-count];
		count =0 ;
		for (int i = 0; i < sa.length; i++) 
		{
			if (sa[i]==' ' && sa[i+1]==' ') 
			{
				continue;
			}
			else
			{
				nsa[count++]=sa[i];
			}
		}
		
	
		
		String s1 = new String(nsa);
		
		System.out.println("After deleting extra spaces => "+s1);
	}
}
