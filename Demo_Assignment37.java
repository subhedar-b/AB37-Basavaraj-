//Assignment 37:WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables
package learning;

import java.util.Scanner;

public class Demo_Assignment37 
{
	static Scanner s1=new Scanner(System.in);
	//System.out.println("Enter the value of A");
	static int a=s1.nextInt();
	//System.out.println("Enter the value of B");
	static int b=s1.nextInt();
	
	 void add()
	{   
	
		int sum=a+b;
		System.out.println("Addition is:"+sum);
	}
	 void sub()
		{   
		
			int sub=a-b;
			System.out.println("Substraction is:"+sub);
		}
	 void mul()
		{   
		
			int mul=a*b;
			System.out.println("Addition is:"+mul);
		}
	 void div()
		{   
		
			int div=a+b;
			System.out.println("Addition is:"+div);
		}



	public static void main(String[] args) 
	{
		Demo_Assignment37 d=new Demo_Assignment37 ();
		d.add();
		d.sub();
		d.mul();
		d.div();
        int sum=a+b;
        System.out.println("sum is:"+sum);
	}

}
