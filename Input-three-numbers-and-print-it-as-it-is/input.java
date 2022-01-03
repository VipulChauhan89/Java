//To take three number from user and print the number as it is
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The numbers are : ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); 
    }
}
