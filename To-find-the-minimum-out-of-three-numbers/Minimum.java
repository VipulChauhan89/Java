/*
  Program to find the minimum out of three numbers 
*/
import java.util.*;
public class Minimum 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n1,n2,n3,min;
        System.out.print("Enter three numbers to find the minimum out of three numbers : ");
        n1=in.nextInt();
        n2=in.nextInt();
        n3=in.nextInt();
        min=n1;
        if(n2<min)
        {
            min=n2;
        }
        if(n3<min)
        {
            min=n3;
        }
        System.out.println("The minimum number is = "+min);
    }    
}
