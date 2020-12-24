package q_03;

public class T2 extends Thread
{
	@Override
	public void run() 
	{
		
		for (char i = 'A'; i <= 'Z'; i++)
		{
			System.out.println(" => "+i);
		}
	}
}
