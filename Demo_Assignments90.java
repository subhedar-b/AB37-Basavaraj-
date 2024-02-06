//Assignments90: Upcasting and downcasting Problem 2 as per Diagram during Class
package learning;
class Exp
{
	void add()
	{
		System.out.println("Addition logic");
	}
}
class Exp1 extends Exp
{
	void sub()
	{
		System.out.println("Substraction logic");
	}
	
}

public class Demo_Assignments90 extends Exp1
{
    void div()
    {
    	System.out.println("Division logic");
    }
	public static void main(String[] args) 
	{
       Exp a=new Demo_Assignments90();	
       a.add();//upcasting
    //   a.div(); unable to access method
     //  a.sub(); unable to access
       
       Demo_Assignments90 d=(Demo_Assignments90)a;
        d.add();
        d.sub();
        d.div();////Down casting

	}

}
