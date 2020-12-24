package q_05;

import java.util.LinkedList;

public class Q_05 
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
		
		al1.add(100);
		
		System.out.println(al1);
	}
}
