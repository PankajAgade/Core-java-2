package q_03;

import java.util.Comparator;

public class copns implements Comparator<Student> 
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.name.compareTo(o2.name);
	}

}
