//Assignment65: Create an array of length 4 & copy its value to another array using iteration
package learning;

import java.util.Arrays;

public class Demo_Assignment65 
{

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=11;
		rollno[1]=12;
		rollno[2]=13;
		rollno[3]=14;
		int rn1[]=new int[4];
		
		for (int i=3;i>=0;i--)
		{
			rn1[i]=rollno[i];
		}
		System.out.println("Print the values of first Array");
		System.out.println(Arrays.toString(rollno));
		System.out.println("Print the values of copied Array");
		System.out.println(Arrays.toString(rn1));
		
		

	}

}
