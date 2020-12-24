package q_04;

public class Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Add obj = new Add();
		
		T1 t1 = new T1(obj);
		T2 t2 = new T2(obj);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Sum => "+obj.a);
	}
}
