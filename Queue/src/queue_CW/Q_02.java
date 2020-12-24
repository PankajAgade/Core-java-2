package queue_CW;

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
		
		
		System.out.println(pq);
		
		Iterator<Integer> it = pq.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}
