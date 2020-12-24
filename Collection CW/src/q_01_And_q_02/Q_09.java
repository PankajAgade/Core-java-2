package q_01_And_q_02;

import java.util.ArrayList;
import java.util.Collections;

public class Q_09
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(5);
		al.add(40);
		al.add(32);
		al.add(10);
		al.add(12);
		al.add(0);
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
		
	}
}
