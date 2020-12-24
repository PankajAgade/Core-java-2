package q_01;

public class VotingAppDemo 
{
	public static void main(String[] args) 
	{
		Kids obj = new Kids(12);
		obj.registerUser();
		obj.requestVotingNumber();
		
		Adult obj1 = new Adult(18);
		obj1.registerUser();
		obj1.requestVotingNumber();
		
	}
}
