import java.util.Scanner;
/*-----Defining a custom exception class------*/
class LengthBreadthException extends Exception 
{
	public LengthBreadthException(String msg)
	{
		super(msg);
	}
}
public class RectangleException{
	public static void main(String[] args)
	{  float length;
	    float breadth;
	    //Creating object of Scanner class
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter length of Rectangle :");
	    length=sc.nextFloat();
	    System.out.println("Enter Breath of Rectangle :");
	    breadth=sc.nextFloat();
	    if(length>=0 && breadth>=0)
	    {
          System.out.println("-------Rectangle-------");
          System.out.println("Length :"+length+"cm");
          System.out.println("Breath :"+breadth+"cm");
          System.out.println("Area : "+(length*breadth)+"sq.cm");
          System.out.println("Perimeter : "+(2*(length+breadth))+"cm");
	    }	
        else 
        {
        	//throw the exception
        	throw new LengthBreadthException("Length and breadthcan not be negative");
        }	
	    
	}
}