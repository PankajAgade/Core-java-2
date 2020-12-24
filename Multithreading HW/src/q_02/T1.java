package q_02;

public class T1 extends Thread
{
	@Override
	synchronized public void run() 
	{
		System.out.println("Sun");
		System.out.println("Mon");
		System.out.println("Tue");
		System.out.println("Wed");
		System.out.println("Thu");
		System.out.println("Fri");
		System.out.println("Sat");
	}
}
