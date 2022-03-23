/*
  program to calculate the area of rectangle in meter square and then find the paint cost to paint the rectangle.  
*/
import java.util.*;
public class PaintCost 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int length,breadth,area,cost,total_cost;
        System.out.print("Enter the length of the rectangle in meters :");
        length=in.nextInt();
        System.out.print("Enter the breadth of the rectangle in meters :");
        breadth=in.nextInt();
        area=length*breadth;
        System.out.print("Enter the cost of paint per square meters in rupees :");
        cost=in.nextInt();;
        total_cost=cost*area;
        System.out.println("The area of rectangle is "+area+" meter square and the total cost of paint that is required to paint the rectangle is "+total_cost+" rupees ");
    }
}
