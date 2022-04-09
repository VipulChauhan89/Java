/*
  Program to check if the entered number is positive negative or zero
*/
import java.util.*;
public class Check 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num=in.nextInt();
        if(num==0)
        {
            System.out.println("The entered number is zero.");
        }
        else if(num<0)
        {
            System.out.println(num+" is the negative number.");
        }
        else
        {
            System.out.println(num+" is the positive number.");
        }
    }
}
