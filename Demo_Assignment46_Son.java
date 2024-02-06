//Assignment46:write a program for hierarchical inheritance and create a three classes(son, daughter, parent) in a single program
package learning;
class Parent
{
	static void thought()
	{
		System.out.println("Parent thoughts");
	}
	
}
class Daughter extends Parent
{
	static void daughter_info()
	{
		System.out.println("Daughter info");
	}
}

public class Demo_Assignment46_Son extends Parent
{
	static void son_info()
	{
		System.out.println("son info");
	}

	public static void main(String[] args) 
	{
		Demo_Assignment46_Son d46=new Demo_Assignment46_Son();
		d46.thought();
		d46.son_info();
		Daughter d=new Daughter();
		d.daughter_info();
		d.thought();

	}

}
