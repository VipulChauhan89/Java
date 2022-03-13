/*
    Program to find the sum and product of two numbers
*/
import java.util.*;
public class SumProduct 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,sum,product;
        System.out.print("Enter the first number :");
        a=in.nextInt();
        System.out.print("Enter the second number :");
        b=in.nextInt();
        sum=a+b;
        product=a*b;
        System.out.println(a+" + "+b+" = "+sum);
        System.out.println(a+" * "+b+" = "+product);
    }
}
