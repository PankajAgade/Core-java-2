package q_01_And_q_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Q_10 
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
		
		System.out.println("List 1 => "+al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>(al);
		System.out.println();
		
		System.out.println("List 2 => "+al1);
		
		StringBuffer sb = new StringBuffer("pankaj");
		
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();
		t.add(sb);
		
		System.out.println(t);
		
	}
}
