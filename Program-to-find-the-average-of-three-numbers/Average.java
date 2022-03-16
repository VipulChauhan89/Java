/*
    Program to find the average of three numbers
*/
import java.util.*;
public class Average
{
    public static void main(String args[])
    {
        int a,b,c;
        double average;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter three numbers to find their average : ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        average=(a+b+c)/3;
        System.out.println("The average of three numbers is = "+average);
    }
}
