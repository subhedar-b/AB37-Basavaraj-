//Assignment75:Create an array of length 4 of int data type. Find out 41 is present or not in array. Print message in both the cases.
package learning;

import java.util.Arrays;

public class Demo_Assignment75
{
    static int i=0;
	public static void main(String[] args) 
	{
		int n[]= {21,31,41,51};
		int numbertocheck=41;
		
		for(i=0;i<=3;i++)
		{
			//System.out.println(n[i]);
			
		if(numbertocheck==n[i])
		{
			System.out.println("The given Number is present "+numbertocheck);
			break;
		}
		}
		
		if(numbertocheck!=n[i])
		{
			System.out.println("The given number is not present");
		}
		
		

	}

}
