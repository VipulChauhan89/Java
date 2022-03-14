//Program to find the area of triangle
import java.util.*;
public class Area
{
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    double base,height,area=0;
		System.out.print("Enter the height of the triangle : ");
		height=in.nextInt();
		System.out.print("Enter the base of the triangle : ");
		base=in.nextInt();
		area=0.5*base*height;
		System.out.println("The area of the triangle is = "+area);
	}
}
