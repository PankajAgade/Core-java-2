package q_25;

import java.util.Iterator;
import java.util.LinkedList;

public class Q_25 
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
			int n = it.next();
			if (n==30) 
			{
				System.out.print(n+" is present in list.");
			}
		}
	}
}
