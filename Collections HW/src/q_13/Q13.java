package q_13;

import java.util.Iterator;
import java.util.LinkedList;

public class Q13 
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
		
		Iterator<Integer> it = al1.iterator();
		
		while (it.hasNext()) 
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("First occurrence => "+al1.getFirst());
		System.out.println("Last  occurrence => "+al1.getLast());
		
	}
}
