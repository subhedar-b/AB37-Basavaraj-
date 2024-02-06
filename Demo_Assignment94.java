//Assignment94: findout the area of a circle for ten times,take pi value from math.pi and take r value from math.random and solve this problem 10 times.
package learning;

public class Demo_Assignment94 
{
	double pi;
	int r=12;

	public static void main(String[] args) 
	{
		double pi=Math.PI;
		for (int i=0;i<10;i++)
		{
			double radius=Math.random();
			double area=pi*radius*radius;
			System.out.println("Radius: " + radius);
			System.out.println("Area: " + area);
		}

	}

}
