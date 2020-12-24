package iterations_CW;

public class Q_06_Print 
{

	public void print() 
	{
		int p = 0;
		int y = 0;
		int py = 0;
		for (int i = 33; i <= 999; i++) 
		{
			if (i%3==0) 
			{
				System.out.println(i+" = Pink");
				p++;
			}
			if (i%5==0) 
			{
				System.out.println(i+" = Yellow");
				y++;
			}
			if (i%3==0 && i%5==0) 
			{
				System.out.println(i+" = PINK & YELLOW");
				py++;
			}			
		}
		System.out.println("PINK COUNT => "+p);
		System.out.println("Yellow COUNT => "+y);
		System.out.println("PINK & YELLOW COUNT => "+py);
	}
	
}
