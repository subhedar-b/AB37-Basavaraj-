//Assignment66: Create an array of length 4 of int data type and find out average of those numbers and remainder of those
package learning;

public class Demo_Assignment66
{

	public static void main(String[] args) 
	{
     int number[]=new int[4];
     number[0]=5;
     number[1]=4;
     number[2]=5;
     number[3]=6;
     int sum=0;
     for(int i=0;i<4;i++)
     {
    	 sum=sum+number[i];
    	 
     }
     System.out.println(sum);
     double averege=sum/number.length;
     System.out.println(averege);
     double reminder=sum%sum;
     System.out.println(reminder);
	}

}
