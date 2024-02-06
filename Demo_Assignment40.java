/*Assignment40:"WAP a program using Switch(3) keyword case1: addition, case2:subtraction, case3:multiplication, 
case4:division and break at case(3).*/
package learning;

public class Demo_Assignment40 
{
	static int a=20;
    static int b=20;
	
	public static void main(String[] args) 
	{
		// int a=20;
         //int b=20;
		switch(3)
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
