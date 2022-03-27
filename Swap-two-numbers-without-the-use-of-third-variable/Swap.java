/*
  program to swap two number without the use of third variable
*/
import java.util.*;
public class Swap 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value in a :");
        a=in.nextInt();
        System.out.print("Enter the value in b :");
        b=in.nextInt();
        System.out.println("Values before swap:\na = "+a+"\nb = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swap:\na = "+a+"\nb = "+b);;
    }    
}
