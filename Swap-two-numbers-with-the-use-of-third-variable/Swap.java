/*
  program to swap two number with the use of third variable
*/
import java.util.*;
public class Swap 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,temp;
        System.out.print("Enter the value in a :");
        a=in.nextInt();
        System.out.print("Enter the value in b :");
        b=in.nextInt();
        System.out.println("Values before swap:\na = "+a+"\nb = "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Values after swap:\na = "+a+"\nb = "+b);;
    }    
}
