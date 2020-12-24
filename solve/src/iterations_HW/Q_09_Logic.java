package iterations_HW;

public class Q_09_Logic {

	public void print() 
	{
		for (int i = 100; i < 200; i++) 
		{
			int temp = i%10;
			
			if (temp == 7) 
			{
				System.out.println("=> "+i);
			}
		}
	}

}
