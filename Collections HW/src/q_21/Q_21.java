package q_21;

import java.util.Iterator;
import java.util.LinkedList;

public class Q_21 
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
		
		LinkedList<Integer> al2 = new LinkedList<Integer>();
		al2 = (LinkedList<Integer>) al1.clone();
		
		System.out.println(al2);
	}
}
