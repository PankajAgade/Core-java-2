package q_05;

public class T1 extends Thread
{
	Add s ;

	public T1(Add obj) 
	{
		s = obj;
	}
	@Override
	public void run() 
	{
		s.sum();
	}
}
