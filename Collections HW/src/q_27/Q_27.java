package q_27;

import java.util.LinkedList;

public class Q_27 
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
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(10);
		ll2.add(20);
		ll2.add(30);
		ll2.add(40);
		ll2.add(50);
		
		System.out.println(al1.containsAll(ll2));
		
		
	}
}
