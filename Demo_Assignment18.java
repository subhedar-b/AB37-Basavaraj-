//Assignment18: WAP with local Variable
package learning;

public class Demo_Assignment18 
{
    public static void Add(int a,int b,int c)//a,b,c local variables
    {
    	int sum=a+b+c;
    	System.out.println("The sum of 3 number's is:"+sum);
    }
    void add(int a,int b,int c) //a,b,c local variables
    {
	   System.out.println("method");
    	
    }
	public static void main(String[] args) 
	{
      String name="Basavaraj"; //name local variable
      Add(12,12,56);
      Demo_Assignment18 d=new Demo_Assignment18();
      d.add(12, 12, 12);
      System.out.println(name);

	}

}
