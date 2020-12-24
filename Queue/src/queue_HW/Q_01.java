package queue_HW;

import java.util.PriorityQueue;

public class Q_01 
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
		
		pq.removeAll(pq);
		
		System.out.println(pq);
	}
}
