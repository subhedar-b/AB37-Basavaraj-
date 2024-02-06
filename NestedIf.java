package learning;

public class NestedIf 
{

	public static void main(String[] args) 
	{
		int salary=10000;
		char gender='M';
		
		if(salary>=12000)
		{
			if(gender=='M')
			{
				
				System.out.println("Logic1");
			}
			else
			{
				System.out.println("Logic2");
				
			}
			
			
		}
		else
		{
			
			System.out.println("Logic3");
			
		}

	}

}
