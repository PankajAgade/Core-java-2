package q_16_sum_of_digits;

public class Sum_of_Digit_logic 
{
	String s = "kskj56kjn";
	int sum = 0;
	
	int SumOfDigits()
	{
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int v = Character.getNumericValue(s.charAt(i));		
				sum = sum + v;//(v-48)
			}
		}
		return sum;
	}
}
