//Program to find the area of square
import java.util.*;
public class Area
{
	public static void main(String[] args) 
	{
	    	Scanner in = new Scanner(System.in);
	    	int x,area=0;
		System.out.print("Enter the side of the square : ");
		x=in.nextInt();
		area=x*x;
		System.out.println("The area of the square is = "+area);
	}
}
