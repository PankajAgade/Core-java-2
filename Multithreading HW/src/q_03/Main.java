package q_03;

public class Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
		T1 t1 = new T1();

		T2 t2 = new T2();
			
		t2.start();
		t2.join();
		t1.start();	
	}
}
