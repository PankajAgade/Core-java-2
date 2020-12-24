package q_01;

public class Kids implements VotingApp 
{
	int age;
	
	Kids(int age)
	{
		this.age = age;
	}
	
	public void registerUser()
	{
		if (age < 12)
		{
			System.out.println("You have successfully registered under Kids");
		}
		else
		{
			System.out.println("You have not successfully registered");
		}
	}
	
	public void requestVotingNumber() 
	{
		if (age < 12)
		{
			System.out.println("Go for Voting");
		}
		else
		{
			System.out.println("Sorry cannot go for voting because Age must be greater than 12 to vote");
		}
	}
}
