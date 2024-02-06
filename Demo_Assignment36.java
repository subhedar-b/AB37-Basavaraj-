//Assignment36: WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as local variables
package learning;

import java.util.Scanner;

public class Demo_Assignment36 
{
	 

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a=s1.nextInt();
		System.out.println("Enter the value of B");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Addition is:"+sum);
		int sub=a-b;
		System.out.println("Substraction is:"+sub);
		int mul=a*b;
		System.out.println("Multiplication is:"+mul);
		int div=a/b;
		System.out.println("Division is:"+div);
		
	}

}
