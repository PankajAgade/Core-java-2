package methods_CW;
//Write a program to illustrate the concept of copying objects using constructors.
public class Q_03 
{
	public static void main(String[] args) 
	{
		Q_03_subClass o1 = new Q_03_subClass(10, "Pankaj");
		
		Q_03_subClass o2 = new Q_03_subClass(o1);
	}
}
