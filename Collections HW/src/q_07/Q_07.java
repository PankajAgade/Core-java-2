package q_07;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q_07 
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
		
		ListIterator<Integer> it = al1.listIterator(2);
		
		while (it.hasNext()) 
		{
			System.out.print(it.next()+" ");
		}
	}
}
