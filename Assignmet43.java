package learning;

interface  Country
{
	void country_names();
    void state_name();	
}
interface  State
{
	void state_name1();
    void city_name();	
}
interface  City
{
	void District_name1();
    void City_name2();	
}


public class Assignmet43 implements City,State,Country
{
    void add()
    {
    	System.out.println("Logic");
    }
    static void sub()
    {
    	
    }
    //abstract void Multiply();
	public static void main(String[] args)
	{
		 Assignmet43 a1=new Assignmet43();
		 a1.city_name();
		 a1.City_name2();
		 a1.country_names();
		 a1.District_name1();
		 a1.state_name1();
		 a1.state_name();

	}

	@Override
	public void country_names() {
		System.out.println("Logic1");
		
	}

	@Override
	public void state_name() {
		// TODO Auto-generated method stub
		System.out.println("Logic2");
		
	}

	@Override
	public void state_name1() {
		// TODO Auto-generated method stub
		System.out.println("Logic3");
		
	}

	@Override
	public void city_name() {
		// TODO Auto-generated method stub
		System.out.println("Logic4");
		
	}

	@Override
	public void District_name1() {
		// TODO Auto-generated method stub
		System.out.println("Logic5");
		
	}

	@Override
	public void City_name2() {
		// TODO Auto-generated method stub
		System.out.println("Logic6");
		
	}

}
