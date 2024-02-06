//Assignment77: WAP to check if 2 arrays are equals to each other for String data type 
package learning;

import java.util.Arrays;

public class Demo_Assignment77 
{

	public static void main(String[] args) 
	{
		String s1[]= {"basu","anand","akshay","manish"};
		String s3=Arrays.toString(s1);
		
		String s2[]= {"basu","anand","akshay","manish"};
		String s4=Arrays.toString(s2);
		if(s3.equals(s4))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
		

	}

}
