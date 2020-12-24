package q_09;

import java.util.Iterator;
import java.util.LinkedList;

public class Q_09 
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
		
		al1.addFirst(0);
		al1.addLast(100);
		
		Iterator<Integer> it = al1.iterator();
		
		while (it.hasNext()) 
		{
			System.out.print(it.next()+" ");
		}
	}
}