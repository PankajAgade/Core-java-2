package queue_HW;

import java.util.PriorityQueue;

public class Q_03 
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

		System.out.println("Priority Queue 1 => "+pq);
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		pq2.add(10);
		pq2.add(52);
		
		System.out.println("Priority Queue 2 => "+pq2);
		
		System.out.println("Compare => "+pq.containsAll(pq2));
	}
}
