/* Assignment42:WAP using switch(s) keyword case1: addition of a&b, case2: subtraction of a&b, 
 * case3: multiplication of a&b, case4: division of a&b. Fetch the value of s,a&b from scanner
 *  class using nextint() method. And print the output individually for all cases.*/
package learning;

import java.util.Scanner;

public class Demo_Assignment42 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of switch");
		int s=sc.nextInt();
		switch(s)
		{
		case 1: int c=a+b;
		        System.out.println("Addition is:"+c);
		        break;
		case 2: int sub=a-b;
                System.out.println("substraction is:"+sub);
                break;
		case 3: int mul=a*b;
                System.out.println("Multiplication is:"+mul);
                break;
		case 4: int div=a/b;
                System.out.println("Division is:"+div);
                break;
		default:System.out.println("Invalid case");
		}

	}

}
