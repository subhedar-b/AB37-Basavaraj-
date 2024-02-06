//Assignment38:WAP to find area of triangle by taking values of b and h from scanner class
package learning;

import java.util.Scanner;

public class Demo_Assignment38 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		System.out.println("Enter the value of h");
		int h=s1.nextInt();
		double areaoftriangle=(0.5*b*h);
		System.out.println("Area of triangle is:"+areaoftriangle);

	}

}
