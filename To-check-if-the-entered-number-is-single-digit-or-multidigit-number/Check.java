/*
  Program to check if the entered number is single digit or multi-digit number
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
        if(num>=-9 && num<=9)
        {
            System.out.println(num+" is the single digit number");
        }
        else
        {
            System.out.println(num+" is the multi digit number");
        }
    }
}
