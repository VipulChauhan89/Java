/*
  program to take the length, breadth, round of fencing and cost of fencing of the farm from the user and then print the total cost of fencing the farm with wire.
*/
import java.util.*;
public class FencingCost
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    float length,breadth,parameter,rounds,total_length,cost,total_cost;
    System.out.print("Enter the length of the farm in meters : ");
    length=in.nextFloat();
    System.out.print("Enter the breadth of the farm in meters : ");
    breadth=in.nextFloat();
    System.out.print("Enter the number of times you want to fence the farm : ");
    rounds=in.nextFloat();
    System.out.print("Enter the cost of fencing in rupees per meter : ");
    cost=in.nextFloat();
    parameter=2*(length+breadth);
    total_length=rounds*parameter;
    total_cost=cost*total_length;
    System.out.println("\nThe parameter of the farm is "+parameter+" meters");
    System.out.println("Total wire required to fence the farm "+rounds+" times is "+total_length+" meters");
    System.out.println("Total cost of fencing the farm is "+total_cost+" rupees");
  }
}
