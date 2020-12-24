package q_03;

public class Q_03 
{
	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		
		t1.start();
		
		System.out.println("Get priority => "+t1.getPriority());
		t1.setPriority(2);
		System.out.println("After Set priority 2 is => "+t1.getPriority());
		
		System.out.println("Get Name => "+t1.getName());
		t1.setName("pankaj");
		System.out.println("After Set name 2 is => "+t1.getName());
		
		
		
	}
}
