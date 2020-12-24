package methods_HW;
/*
Create 4 overloaded methods for “test ()” and invoke all versions of the overloaded methods.
Create another class Overload.java which has a main method to call the overloaded methods inOverloadDemo.java
 */
public class Q_05 
{
	public static void main(String[] args) 
	{
		Q_05_Overload obj = new Q_05_Overload();
		
		obj.test(5);
		obj.test(5,5);
		obj.test(0.5,5,5);
		obj.test(5,10,5,10);
		
	}
}
