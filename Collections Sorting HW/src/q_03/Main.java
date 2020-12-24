package q_03;

import java.util.ArrayList;
import java.util.Collections;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Pankaj", 4, 70));
		al.add(new Student("Mayaur", 5, 80));
		al.add(new Student("Kishor", 6, 65));
		al.add(new Student("Sagar", 7, 20));
		al.add(new Student("Mayuri", 3, 90));
		al.add(new Student("Chetan", 4, 100));
		
		System.out.println(al);
		
		Collections.sort(al, new copns());
		
		System.out.println(al);
		
	}
}
