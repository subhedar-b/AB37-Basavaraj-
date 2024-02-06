package learning;

public class MethodOverLoading 
{
    static void Add(int a)
    {
    	System.out.println("1");
    	
    }
    static void Add(double a)
    {
    	System.out.println("2");
    	
    }
    void Add(char a)
    {
    	System.out.println("3");
    	
    }
    void Add(boolean a)
    {
    	System.out.println("4");
    	
    }
    void Add(String a)
    {
    	System.out.println("3");
    	
    }
	
	
	public static void main(String[] args) 
	{
		Add(10);
		Add(10.2);
		MethodOverLoading m1=new MethodOverLoading();
		m1.Add('M');
		m1.Add(false);
		m1.Add("Hello");

	}

}
