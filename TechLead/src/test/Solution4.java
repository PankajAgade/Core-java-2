package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution4 
{
	public static void main(String[] args) 
	{
		int[] arr1 ={1,3,4,5,6,7,8,9,9};
		int[] arr2 =  {1,2,3,4,5,6,8,5,8,8,9,99};
		Set<Integer> set = new TreeSet<Integer>();
		
		int count = 0;
		int uniqe = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr1.length; i++) 
		{
			if(uniqe!=arr1[i])
			{
				for (int j = 0; j < arr2.length; j++) 
				{
					if(arr1[i]==arr2[j])
					{
						arr1[i]=uniqe;
						arr2[j]=uniqe;
						break;
					}
				}
			}
		}
		
		for(int p:arr1)
		{
			if (p!=uniqe) 
			{
				set.add(p);
			}
		}
		
		for(int p:arr2)
		{
			if (p!=uniqe) 
			{
				set.add(p);
			}
		}
		
		
		System.out.println(set);
		
		for(int p: set)
		{
			System.out.print(p+" ");
		}
		
		List<Integer> k = new ArrayList<Integer>();
		System.out.println(k.get(0));
	}
}
