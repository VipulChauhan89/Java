/*
    Program to find the length of the rectangle from the given area and breadth of the rectangle
*/
import java.util.*;
public class RectangleLength
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Area of the rectangle : ");
        int a=in.nextInt();
        System.out.print("Enter the Breadth of the rectangle : ");
        int b=in.nextInt();
        float l=a/b;
        System.out.println("The length of the rectangle is : "+l);
    }
}
