/*
    Program to find the area of the triangle using herons formula
*/
import java.util.*;
public class Area 
{
    public static void main(String args[])
    {
        int a,b,c;
        double s,area;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle : ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the trianle is = "+area);
    }
}
