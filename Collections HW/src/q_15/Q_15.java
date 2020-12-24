package q_15;

import java.util.Iterator;
import java.util.LinkedList;

public class Q_15 
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
		int count=0;
		while (it.hasNext()) 
		{
			System.out.println(" "+count+++" => "+it.next()+" ");
		}
	}
}
