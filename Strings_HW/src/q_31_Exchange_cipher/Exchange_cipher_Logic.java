package q_31_Exchange_cipher;

public class Exchange_cipher_Logic
{
	String s = "abcXYZ";
	
	void exchange_cipher()
	{
		String s1 = s.toUpperCase();
		
		char[] arr = s1.toCharArray();
		
		System.out.println("=> "+('A'+'Z'-'A'));
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= (char) ('A'+'Z'-arr[i]);
			
		}
		
		String s2 = new String(arr);
		
		System.out.println("Exchange cipher String => "+s2);
	}
}
