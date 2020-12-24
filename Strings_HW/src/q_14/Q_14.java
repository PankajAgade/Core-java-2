package q_14;

public class Q_14
{
	String s = "kskj5kjn";
	
	boolean checkNumber()
	{
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
}
