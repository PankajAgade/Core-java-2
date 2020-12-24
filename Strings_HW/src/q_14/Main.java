package q_14;

public class Main 
{
	public static void main(String[] args) 
	{
		Q_14 obj = new Q_14();
		
		System.out.println("String => "+obj.s);
		
		if (obj.checkNumber())
		{
			System.out.println("In string present number");
		}
		else
		{
			System.out.println("In string not present number");
		}
	}
}
