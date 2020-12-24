package queue_HW;

import java.util.PriorityQueue;

public class Q_04 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(0);
		pq.add(10);
		pq.add(10);
		pq.add(10);
		pq.add(10);
		pq.add(10);
		
		System.out.println(pq);
		
		System.out.println("First => "+pq.peek());
		
	}
}
