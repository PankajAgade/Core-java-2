package q_01;

public class Adult implements VotingApp
{

	int age;
	
	Adult(int age)
	{
		this.age = age;
	}
	@Override
	public void registerUser()
	{
		if (age > 12) 
		{
			System.out.println("You have successfully registered under an Adult");
		}
		else
		{
			System.out.println("You have not successfully registered under an Adult");
		}
	}

	@Override
	public void requestVotingNumber() 
	{
		if (age > 12) 
		{
			System.out.println("Your voting Id will be generated within a day");
		}
		else
		{
			System.out.println("Oops, you are not");
		}
	}

}
