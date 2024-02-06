//Assignment45:WAP for multilevel inheritance in a single program and make all the methods are non static
package learning;

 class Demo2
{
	void add()
	{
		System.out.println("Implement Addition Logic");
	}
}
 class Demo3 extends Demo2
{
	 void sub()
	 {
        System.out.println("Implement Substraction Logic");
	 }
	 
}
 class Demo4 extends Demo3
{
	 void mul()
	 {

			System.out.println("Implement Multiplication Logic");
	 }
	 
}

public class Demo_Assignment45 extends Demo4
{

	public static void main(String[] args) 
	{
		Demo_Assignment45 d45=new Demo_Assignment45();
		d45.add();
		d45.sub();
		d45.mul();

	}

}
