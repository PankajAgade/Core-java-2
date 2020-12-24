package array;

import java.util.Scanner;

public class jbjvk 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
	    String s = kb.nextLine();  


	       String[] arr = s.split(" "); 
	        String result = ""; 
	   
	        for (int i = 0; i < arr.length; i++)
	        { 
	            if (i == arr.length - 1) 
	            {
	                 result = arr[i] + result; 
	            }
	            else
	            {
	                result = " " + arr[i] + result; 
	            }
	        } 
	       
	       System.out.println(result);
	    
	}
}
