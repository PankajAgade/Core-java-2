package queue_HW;

import java.util.PriorityQueue;

public class Q_05
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
		
		Object[] arr = pq.toArray();
		
		for (Object p : arr)
		{
			System.out.print(p+" ");
		}
		
	}
}
