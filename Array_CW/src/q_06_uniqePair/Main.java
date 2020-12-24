package q_06_uniqePair;

public class Main 
{
	public static void main(String[] args) 
	{
		Input obj1 = new Input();
		int[] arr = obj1.input();
		
		Logic obj2 = new Logic();
		obj2.print(obj2.pair(arr));
		
		obj2.uniqPair(obj2.pair(arr));
		
		
	}
}
