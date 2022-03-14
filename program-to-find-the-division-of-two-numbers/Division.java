//Program to find the division of two numbers
import java.util.*;
public class Division
{
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int x,y;
	    float div;
		System.out.print("Enter the dividend : ");
		x=in.nextInt();
		System.out.print("Enter th divisor : ");
		y=in.nextInt();
		div=x/y;
		System.out.println(x+" / "+y+" =  "+div);
	}
}
