/*Assignment41:"WAP a program using  Switch(s) keyword case1:
addition, case2:subtraction, case3:multiplication, 
case4 And fetch the value of 's' with scanner
class using next int() method."*/
package learning;

import java.util.Scanner;

public class Demo_Assignment41
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the value of a");
		//int a=sc.nextInt();
		//System.out.println("Enter the value of b");
		//int b=sc.nextInt();
		System.out.println("Enter the value of switch");
		int s=sc.nextInt();
		int a=25;
		int b=5;
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
