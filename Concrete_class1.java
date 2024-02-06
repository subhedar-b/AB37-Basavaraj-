package learning;

 class Concrete_class2
{
	static void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
		
	}
}
 abstract class Abstarct_class1 extends Concrete_class2
 {
	 abstract void multiply();
	 abstract void division();
	 
 }
public class Concrete_class1 extends Abstarct_class1
{

	public static void main(String[] args) 
	{
       Concrete_class1 c1=new Concrete_class1();
       c1.multiply();
       c1.division();
       c1.add1();
   
       c1.sub();
       add();
       sub1();
       

	}

	@Override
	void multiply() 
	{
		System.out.println("Multiply");
		
	}

	@Override
	void division() 
	{
		System.out.println("Division");
		
	}
	void add1()
	{
		System.out.println("add1");
	}
	static void sub1()
	{
		System.out.println("sub1");
	}

}
