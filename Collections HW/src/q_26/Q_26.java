package q_26;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q_26 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> al1 = new LinkedList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		System.out.println("Linked List => "+al1);
		
		ArrayList<Integer> al = new ArrayList<Integer>(al1);
		
		System.out.println("Array  List => "+al);
	}
}
