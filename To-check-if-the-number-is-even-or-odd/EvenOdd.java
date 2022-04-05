/*
  program to check if the entered number is even or odd
*/
import java.util.*;
public class EvenOdd 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num=in.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is an even number.");
        }
        else
        {
            System.out.println(num+" is an odd number.");
        }
    }
}
