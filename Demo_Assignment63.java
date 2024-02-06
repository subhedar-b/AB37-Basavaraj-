//Assignment63:Create an array of length =5 of int data type and fetch its value from scanner class.
package learning;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_Assignment63 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			//Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of index:"+i);
			rollno[i]=s1.nextInt();
		}
        
        //System.out.println(rollno[1]);
       // System.out.println(rollno[2]);
       // System.out.println(rollno[3]);
       // System.out.println(rollno[4]); 
       System.out.println("Array values are:");
       //System.out.println);
       System.out.println(Arrays.toString(rollno));
       
        
        
        
		
	}

}
