//Program to find the roots of the quadratic equation
import java.util.*;
public class roots
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the three coefficients of the quadratic equation : ");
	    double A,B,C;
	    A=in.nextDouble();
        B=in.nextDouble();
        C=in.nextDouble();
	    System.out.println((-B+Math.sqrt(B*B-4*A*C))/(2*A));
	    System.out.println((-B-Math.sqrt(B*B-4*A*C))/(2*A));
    }
}