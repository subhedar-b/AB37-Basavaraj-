//Assignment39:WAP by taking value of age from scanner class and if age is greater than or equal to 18 then print " i am adult" else print " i am young"
package learning;

import java.util.Scanner;

public class Demo_Assignment39 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("I am adult");
		}
		else
		{
			System.out.println("I am young");
		}

	}

}
