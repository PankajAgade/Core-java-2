package q_07;

public class Q_07 
{
	public static void main(String[] args) throws InterruptedException 
	{
		T1 t1 = new T1();
		t1.start();
		
		t1.join();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("I am form Main.");
		}
		
	}
}
