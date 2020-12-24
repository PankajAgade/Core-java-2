package q_07;

public class TrainersActivity 
{
	public static void main(String[] args) 
	{
		Trainee obj1 = new Trainee(123, "pankaj", "umred", 789, 100);
		obj1.calculateSalary();
		obj1.calculateTransportAllowance();
		
		System.out.println();
		
		Manager obj2 = new Manager(123, "pankaj", "umred", 789, 100);
		obj2.calculateSalary();
		obj2.calculateTransportAllowance();
	}
}
