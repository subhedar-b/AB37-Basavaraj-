/* Assignment22: WAP with 3 methods main,static add and static subtract. Declare and initialize a and b global variables as non- static in nature 
and then perform addition and subtraction with static methods */
package learning;

public class Demo_Assignment21 
{
	 static int a;
	 static int b;
	 static int sum;
	 static int sub;
	 int x=20;
	 static void add()
	 {
		 
	  a=12;
	  b=20;
	  sum=a+b;
	  System.out.println("Addition is:"+sum);
	 }
	 static void sub()
	 {
	  a=12;
	  b=20;
	  sub=a-b;
	  System.out.println("Substraction is:"+sub);
	 }


	public static void main(String[] args) 
	{
     add();		
     sub();
     Demo_Assignment21 d= new Demo_Assignment21();
     System.out.println(d.x);
  
	}

}
