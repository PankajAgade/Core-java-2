package q_23;

import java.util.LinkedList;

public class Q_23_and_24
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> al1 = new LinkedList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		System.out.println(al1);
		
		System.out.println(al1.peekFirst());
		System.out.println(al1.peekLast());
	}
}
