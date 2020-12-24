package queue_CW;

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
		
		
		System.out.println(pq);
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		pq1.addAll(pq);
		
		System.out.println(pq1);
		
	}
}
