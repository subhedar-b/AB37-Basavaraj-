/*Assignment64:Create an array of length 3 having String datatype and print it without sorting. Now Sort the array and print its value after sorting.
Use toString function to print the array*/
package learning;

import java.util.Arrays;

public class Demo_Assignment64 
{

	public static void main(String[] args)
	{
		String name[]=new String[3];
		name[0]="Swathi";
		name[1]="Dheeraj";
		name[2]="Basu";
	System.out.println(Arrays.toString(name));
	Arrays.sort(name);
	 System.out.println(Arrays.toString(name));
	 
	
		

	}

}
