//Assignment101: WAP on PriorityQueue 
package learning;

import java.util.PriorityQueue;

public class Ddmo_Assignment101 
{

	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue();
		p.add("basu");
		p.add("basu");//Duplicate  allowed
		p.add("akshay");
		p.add("kiran");
		//Collections.sort(lh); //not allowed
		/*p.add(12);
		p.add(12.24);
		p.add(true);
		p.add(null);
		p.add('a'); */
		System.out.println(p);

	}

}
