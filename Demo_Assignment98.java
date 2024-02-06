//Assignment98: WAP on LinkedList 
package learning;

import java.util.Collections;
import java.util.LinkedList;

public class Demo_Assignment98 
{

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("basu");
		l.add("akshay");
		l.add("anand");
		l.add("prashanta");
		l.add("anand");
		Collections.sort(l);
		System.out.println(l);
		
		l.add(12);
		l.add(12.34);
		l.add(12.34567);
		l.add('c');
		l.add('d');
		l.add(true);
		l.add(false);
		l.add(null);
		System.out.println(l);
		
		

	}

}
