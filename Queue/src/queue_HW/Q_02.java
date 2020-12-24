package queue_HW;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q_02 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(10);
		pq.add(10);
		pq.add(10);
		pq.add(10);
		pq.add(10);
		
		
		Iterator<Integer> it = pq.iterator();
		int count = 0;
		while(it.hasNext())
		{
			System.out.println(count+++" = "+it.next());
		}
	}
}
