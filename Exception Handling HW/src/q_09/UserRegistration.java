package q_09;

public class UserRegistration 
{
	public static void main(String[] args) throws Exception
	{
		registerProfile("Pankaj", 17, "india");
	}
	
	static void registerProfile(String userName , int age, String country) throws Exception
	{
		if (country!="India" || country!="india")
		{
			throw new InvalidCoUNtryException(userName+", Invalid Country");
		}
		else if (age < 18)
		{
			throw new InvalidAgeException(userName+" you in Minor");
		}
		else
		{
			System.out.println("Wellcome, register Successfully.");
		}
	}
}
