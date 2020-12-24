package q_02;

public class Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
		T1 t1 = new T1();
		T2 t2 = new T2();
		T3 t3 = new T3();
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
	}
}
