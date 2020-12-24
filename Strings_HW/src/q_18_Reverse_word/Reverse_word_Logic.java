package q_18_Reverse_word;

public class Reverse_word_Logic
{
	String s = "I am Pankaj";
	
	public void Reverse_word()
	{
		String[] arr = s.split(" ");
		
		System.out.print("Reverse word => ");
		for (int i =  arr.length-1; i >= 0; i--) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public void Reverse_word_letter()
	{
		String[] arr = s.split(" ");
		
		System.out.println();
		System.out.print("Reverse word and letter => ");
		for (int i =  arr.length-1; i >= 0; i--) 
		{
			StringBuffer sb = new StringBuffer(arr[i]);
			System.out.print(sb.reverse()+" ");
		}
		System.out.println();
	}
}
