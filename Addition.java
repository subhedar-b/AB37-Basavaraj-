package learning;

abstract class  Country2 implements Interface1,interface2
{
	static int b=12;
	abstract void test();
    void test1(int a)
    {
       
    	System.out.println("Conc1");
    }
    static void test2()
    {
    	System.out.println("Conc1");
    }
    
}


public class Addition extends Country2
{
   
	
	public static void main(String[] args) 
	
	{
		test2();
		Addition a1=new Addition();
		a1.test1(1);
		System.out.println(b);
		
		
		

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}

}
