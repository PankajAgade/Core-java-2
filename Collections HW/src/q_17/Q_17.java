package q_17;

import java.util.Iterator;
import java.util.LinkedList;

public class Q_17 
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
		
		al1.removeFirst();
		al1.removeLast();
		
		Iterator<Integer> it = al1.iterator();
		
		while (it.hasNext()) 
		{
			System.out.print(it.next()+" ");
		}
	}
}
