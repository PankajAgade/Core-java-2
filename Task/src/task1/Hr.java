package task1;

import java.util.Scanner;

public class Hr
{
	public static void main(String[] args){
		
		int testCases = 3;
        String[] arr = new String[testCases];
        
		String[] arr2 = new String[testCases];
        
		arr[0]="10";
		arr[1]="sanjay";
		arr[2]="sasas asasasa sasasas asasasas";
	   
        for(int i=0 ; i<arr.length ; i++)
        {
        	 int countoc = 0;
             int countcc = 0;
             
             int countos = 0;
             int countcs = 0;
             
             int countoce = 0;
             int countcce = 0;
            
             int dcount =0;
            boolean flag = false;
            for(int j=0 ; j<arr[i].length() ; j++)
            {
                if(arr[i].charAt(j)=='(')
                {
                	countoc++;
                }
                if(arr[i].charAt(j)==')' )
                {
                	countcc++;
                }
                if(arr[i].charAt(j)=='[')
                {
                	countos++;
                }
                if(arr[i].charAt(j)==']')
                {
                	countcs++;
                }
                if(arr[i].charAt(j)=='{')
                {
                	countoce++;
                }
                if(arr[i].charAt(j)=='}')
                {
                	countcce++;
                }
                if(arr[i].charAt(j)>='0' && arr[i].charAt(j)<='9')
                {
                	
                	dcount++;
                }
            }
            if((countoc==countcc) && (countos==countcs) &&  (countoce==countcce))
            {
            	flag = true;
            }
          
            if(dcount==arr[i].length())
            {
            	flag = false;
            }
             if(flag)
             {
                 arr2[i]="Valid";
             }
             else
             {
                arr2[i]= "Invalid";
             }
        }
        
        for(String p: arr2)
        {
            System.out.println(p);
        }
	}
}



