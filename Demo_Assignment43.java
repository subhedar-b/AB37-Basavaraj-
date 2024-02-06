//Assignment43:WAP for single level inheritance in a single program and make all methods non static(selenium,java,gk) by creating object in child class
package learning;

class Demo
{
	void selenium()
	{
		System.out.println("Impliment selenium logic");
	}
    void java()
    {
    	System.out.println("Impliment java logic");
    }
    void gk()
    {
    	System.out.println("Impliment gk logic");
    }
}
public class Demo_Assignment43 extends Demo
{

	public static void main(String[] args) 
	{
		Demo_Assignment43 d=new Demo_Assignment43();
		d.selenium();
		d.java();
		d.gk();

	}

}
