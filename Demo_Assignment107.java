//Assignment107: WAP for return keyword for float , double , string , boolen , using scanner class
package learning;

import java.util.Scanner;

public class Demo_Assignment107
{
    
    
    int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	double substract(int a,double b)
	{
		double sub=a-b;
		return sub;
	}
	
	String Name(String s)
	{
		String name="hi";
		return name;
	}
	float number(float f)
	{
		float Number=12.4567f;
		return Number;
	}
	boolean state(boolean y)
	{
		boolean y1=false;
		return y1;
	}
	
	public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter the value of a");
	     int a=s1.nextInt();
	     System.out.println("Enter the value of b");
	     int b=s1.nextInt();
	     System.out.println("Enter the value of string");
	     String s=s1.next();
	     System.out.println("Enter the value of float");
	     float f=s1.nextFloat();
	     System.out.println("Enter the value of boolean");
	     boolean y=s1.nextBoolean();
	     
		Demo_Assignment107 d7=new Demo_Assignment107();
		System.out.println("Addition is:"+d7.add(a, b));
		System.out.println("Sub is:"+d7.substract(a, b));
		System.out.println("The given string is:"+d7.Name(s)); 
		System.out.println("The given float is:"+d7.number(f));
		System.out.println("The given boolean is:"+d7.state(y));

	}

}
