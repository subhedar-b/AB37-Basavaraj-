//Assignments84:Check if 2 given strings are anagram of each other or not
package learning;

import java.util.Arrays;

public class Demo_Assignments84 
{

	public static void main(String[] args) 
	{
		String s1="race";
		String s2="care";
		
		char c[]=s1.toCharArray();
		char c1[]=s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		
		if(Arrays.equals(c, c1))
		{
			System.out.println("The given two strings are Anagram");
		}
		else
		{
		  System.out.println("The given two strings are Not Anagram");
		}
			
				
	}

}
