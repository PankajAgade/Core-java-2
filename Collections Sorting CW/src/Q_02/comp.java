package Q_02;

import java.util.Comparator;

public class comp implements Comparator<Employee> 
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if (o1.salary == o2.salary)
		{
			return o1.name.compareTo(o2.name);
		}
		else if(o1.salary<o2.salary)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

}
