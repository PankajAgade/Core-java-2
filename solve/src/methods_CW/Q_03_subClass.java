package methods_CW;

public class Q_03_subClass
{
	int rollNo;
	String name;
	
	public Q_03_subClass(int rollNo, String name) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Q_03_subClass(Q_03_subClass o1) 
	{
		this.rollNo = o1.rollNo;
		this.name = o1.name;
	}
	
}
