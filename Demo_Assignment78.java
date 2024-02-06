//Assignment78: WAP to check if 2 arrays are equals to each other for int data type 
package learning;

import java.util.Arrays;

public class Demo_Assignment78
{

	public static void main(String[] args) 
	{
		int a[]= {12,13,14,14};
		
		int b[]= {12,13,14,14};
		boolean answer= Arrays.equals(a, b);
		
		if(answer==true)
		{
			System.out.println("The given integer of an array is equal");
		}
		else
		{
			System.out.println("The given integer of an array is not equal");
		}
	}

}
